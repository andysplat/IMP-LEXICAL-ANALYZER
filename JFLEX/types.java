
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

abstract interface Expression {
	String show();
	int interpret(ArrayList<Expression> VarList, int line, boolean interpret);
};


class Main implements Expression {
	Expression sequence;

	public Main(Expression sequence) {
		super();
		this.sequence = sequence;
	}

	@Override
	public String show() {
		String build = "";
		build += "<MainNode>\n";
		
		String print = "";
		print += sequence.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		int lines = 1;
		lines += this.sequence.interpret(VarList, line + lines, interpret);
		return lines;
	}
	
};

class Sequence implements Expression {
	Expression first;
	Expression second;

	public Sequence(Expression first) {
		super();
		this.first = first;
		this.second = null;
	}

	public Expression second(Expression second) {
		this.second = second;
		return this;
	}

	@Override
	public String show() {
		String build = "";
		build += "<SequenceNode>\n";
		
		String print = "";
		print += first.show() + second.show();
	
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		int lines = 0;
		lines += this.first.interpret(VarList, line, interpret);
		lines += this.second.interpret(VarList, line + lines, interpret);
		return lines;
	}
	
};

class Par implements Expression {
	Expression expression;

	public Par(Expression expression) {
		super();
		this.expression = expression;
	}

	public Expression Expression() {
		return this.expression;
	}

	@Override
	public String show() {
		String build = "";
		build += "<BracketNode> ()\n";

		String print = "";
		print += expression.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		return this.expression.interpret(VarList, line, interpret);
	}
	
};

class Block implements Expression {
	Expression expression;

	public Block(Expression expression) {
		super();
		this.expression = expression;
	}
	
	public Expression expression() {
		return this.expression;
	}


	@Override
	public String show() {
		String build = "";
		build += "<BlockNode> {}\n";

		if(this.expression != null) {
			String print = "";
			print += expression.show();
			build += Parser.addNewline(print);
		} 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		int lines = 0;		
		if(this.expression != null)
			lines += this.expression.interpret(VarList, line + lines, interpret) + 1;
		
		return lines;
	}
	
	
};

class If implements Expression {
	Expression condition;
	Expression first;
	Expression second;

	public If(Expression condition) {
		super();
		this.condition = condition;
		this.first = null;
		this.second = null;
	}
	
	public Expression first(Expression first) {
		this.first = first;
		return this;
	}
	
	public Expression second(Expression second) {
		this.second = second;
		return this;
	}

	@Override
	public String show() {
		String build = "";
		build += "<IfNode> if\n";
		
		String print = "";
		print += condition.show() + first.show() + second.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		int lines = 1;
		
		if(this.condition.interpret(VarList, line + lines, interpret) == 1) {
			lines += this.first.interpret(VarList, line + lines, interpret);
			if(((Block) this.first).expression() == null)
				if(((Block) this.second).expression() != null)
					lines++;
			lines += this.second.interpret(VarList, line + lines, !interpret);
		}
		else {
			lines += this.first.interpret(VarList, line + lines, !interpret);
			if(((Block) this.first).expression() == null)
				if(((Block) this.second).expression() != null)
					lines++;
			lines += this.second.interpret(VarList, line + lines, interpret);
		}
		return lines;
	}
	
	
};

class While implements Expression {
	Expression condition;
	Expression expression;

	public While(Expression condition) {
		super();
		this.condition = condition;
		this.expression = null;
	}
	
	public Expression expression(Expression expression) {
		this.expression = expression;
		return this;
	}
	
	@Override
	public String show() {
		String build = "";
		build += "<WhileNode> while\n";
		
		String print = "";
		print += condition.show() + expression.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		int lines = 1;
		if(this.condition.interpret(VarList, line + lines, interpret) == 1)
			lines += this.expression.interpret(VarList, line + lines, interpret);
		else
			lines += this.expression.interpret(VarList, line + lines, !interpret);			
		if(interpret)
		while(this.condition.interpret(VarList, line + 1, interpret) == 1)
			this.expression.interpret(VarList, line + 1, interpret);
		
		return lines;
	}
	
};

class Number implements Expression {
	int number;

	public Number(String number) {
		super();
		this.number = Integer.parseInt(number);
	}

	@Override
	public String show() {
		return "<IntNode> " + number + "\n";
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		return this.number;
	}
	
};

class Bool implements Expression {
	boolean bool; 

	public Bool(String bool) {
		super();
		if(bool.equals("true"))
			this.bool = true;
		else
			this.bool = false;
	}

	@Override
	public String show() {
		return "<BoolNode> " + bool + "\n";
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		if(bool)
			return 1;
		else
			return 0;
	}
	
};

class Var implements Expression {
	String variable;
	int value;

	public Var(String variable) {
		super();
		this.variable = variable;
		this.value = -1;
	}

	public Expression value(int value) {
		this.value = value;
		return this;
	}

	public String variable() {
		return this.variable;
	}

	@Override
	public String show() {
		return "<VariableNode> " + variable + "\n";
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
			return this.value;
	}
	
};

class Assignment implements Expression {
	Expression variable;
	Expression number;

	public Assignment(Expression variable, Expression number) {
		super();
		this.variable = variable;
		this.number = number;
	}

	@Override
	public String show() {
		String build = "";
		build += "<AssignmentNode> =\n";
		
		String print = "";
		print += variable.show() + number.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		int lines = 1;
		line += lines;
		if(this.number instanceof Var)
		for(int o = 0; o < VarList.size(); o++) 
			if(VarList.get(o) instanceof Var) {
			if(((Var) VarList.get(o)).variable().equals(((Var) number).variable())) {
				this.number = ((Var) number).value(((Var) VarList.get(o)).interpret(VarList, line, interpret));
				if(interpret) 
					if(this.number.interpret(VarList, line, interpret) == -1) {
						VarList.add(new Symbol("UnassignedVar " + line));	
					}
				break;
			}
			else if(o == VarList.size() - 1) {
				VarList.add(new Symbol("UnassignedVar " + line));				
			}
			} 
		for(int o = 0; o < VarList.size(); o++) 
			if(VarList.get(o) instanceof Var) {
			if(((Var) VarList.get(o)).variable().equals(((Var) variable).variable())) {
				if(interpret)
					VarList.set(o, ((Var) VarList.get(o)).value(number.interpret(VarList, line, interpret)));
				else
					number.interpret(VarList, line, interpret);
				break;
			}
			else if(o == VarList.size() - 1) {
				VarList.add(VarList.size() - 1, new Symbol("UnassignedVar " + line));				
				return lines;	
			}
			} 
		return lines;
	}
	
}

class Greater implements Expression {
	Expression first;
	Expression second;

	public Greater(Expression first, Expression second) {
		super();
		this.first = first;
		this.second = second;
	}

	public Expression first(Expression first) {
		this.first = first;
		return this;
	}

	public Expression first() {
		return this.first;
	}

	@Override
	public String show() {
		String build = "";
		build += "<GreaterNode> >\n";
		
		String print = "";
		print += first.show() + second.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		if(this.first instanceof Var)
		for(int o = 0; o < VarList.size(); o++) 
			if(VarList.get(o) instanceof Var) {
			if(((Var) VarList.get(o)).variable().equals(((Var) first).variable())) {
				this.first = ((Var) first).value(((Var) VarList.get(o)).interpret(VarList, line, interpret));
				if(interpret) 
					if(this.first.interpret(VarList, line, interpret) == -1) {
						VarList.add(new Symbol("UnassignedVar " + line));				
						return line;	
					}
				break;
			}
			else if(o == VarList.size() - 1) {
				VarList.add( new Symbol("UnassignedVar " + line));			
				return line;	
			}
			}
		if(this.second instanceof Var)
		for(int o = 0; o < VarList.size(); o++) 
			if(VarList.get(o) instanceof Var) {
			if(((Var) VarList.get(o)).variable().equals(((Var) second).variable())) {
				this.second = ((Var) second).value(((Var) VarList.get(o)).interpret(VarList, line, interpret));
				if(interpret) 
					if(this.second.interpret(VarList, line, interpret) == -1) {
						VarList.add(new Symbol("UnassignedVar " + line));				
						return line;	
					}
				break;
			}
			else if(o == VarList.size() - 1) {
				VarList.add( new Symbol("UnassignedVar " + line));				
				return line;	
			}
			}
		if(this.first.interpret(VarList, line, interpret) > this.second.interpret(VarList, line, interpret))
			return 1;
		else
			return 0;
	}
	
};

class Not implements Expression {
	Expression condition;

	public Not(Expression condition) {
		super();
		this.condition = condition;
	}
	
	@Override
	public String show() {
		String build = "";
		build += "<NotNode> !\n";
		
		String print = "";
		print += condition.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		if(this.condition.interpret(VarList, line, interpret) == 1)
			return 0;
		else
			return 1;
	}
	
};

class And implements Expression {
	Expression first;
	Expression second;

	public And(Expression second) {
		super();
		this.first = null;
		this.second = second;
	}
	
	public Expression first(Expression first) {
		if(this.first instanceof And)
			this.first = ((And)this.first).first(first);
		else
			this.first = first;
		return this;
	}

	@Override
	public String show() {
		String build = "";
		build += "<AndNode> &&\n";
		
		String print = "";
		print += first.show();
		print += second.show();
		
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		if(this.first.interpret(VarList, line, interpret) + this.second.interpret(VarList, line, interpret) > 1)
			return 1;
		else
			return 0;
	}
	
};

class Plus implements Expression {
	Expression first;
	Expression second;

	public Plus(Expression second) {
		super();
		this.first = null;
		this.second = second;
	}
	
	public Expression first(Expression first) {
		if(this.first instanceof Plus)
			this.first = ((Plus)this.first).first(first);
		else
			this.first = first;
		return this;
	}

	public Expression first() {
		if(this.first instanceof Plus)
			return ((Plus)this.first).first();
		else
			return this.first;
	}

	@Override
	public String show() {
		String build = "";
		build += "<PlusNode> +\n";
		
		String print = "";
		print += first.show() + second.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		if(this.first instanceof Var)
		for(int o = 0; o < VarList.size(); o++) 
			if(VarList.get(o) instanceof Var) {
			if(((Var) VarList.get(o)).variable().equals(((Var) first).variable())) {
				this.first = ((Var) first).value(((Var) VarList.get(o)).interpret(VarList, line, interpret));
				if(interpret) 
					if(this.first.interpret(VarList, line, interpret) == -1) {
						VarList.add(new Symbol("UnassignedVar " + line));				
						return line;	
					}
				break;
			}
			else if(o == VarList.size() - 1) {
				VarList.add(new Symbol("UnassignedVar " + line));					
				return line;	
			}
		}
		if(this.second instanceof Var)
		for(int o = 0; o < VarList.size(); o++) 
			if(VarList.get(o) instanceof Var) {
			if(((Var) VarList.get(o)).variable().equals(((Var) second).variable())) {
				this.second = ((Var) second).value(((Var) VarList.get(o)).interpret(VarList, line, interpret));
				if(interpret) 
					if(this.second.interpret(VarList, line, interpret) == -1) {
						VarList.add(new Symbol("UnassignedVar " + line));				
						return line;	
					}
				break;
			}
			else if(o == VarList.size() - 1) {
				VarList.add(new Symbol("UnassignedVar " + line));				
				return line;	
			}
		}
		return this.first.interpret(VarList, line, interpret) + this.second.interpret(VarList, line, interpret);
	}
	
};

class Div implements Expression {
	Expression first;
	Expression second;

	public Div(Expression first, Expression second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public String show() {
		String build = "";
		build += "<DivNode> /\n";
		
		String print = "";
		print += first.show() + second.show();
		
		build += Parser.addNewline(print); 
		return build;
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		if(this.first instanceof Var)
		for(int o = 0; o < VarList.size(); o++) 
			if(VarList.get(o) instanceof Var) {
			if(((Var) VarList.get(o)).variable().equals(((Var) first).variable())) {
				this.first = ((Var) first).value(((Var) VarList.get(o)).interpret(VarList, line, interpret));
				if(interpret) 
					if(this.first.interpret(VarList, line, interpret) == -1) {
						VarList.add(new Symbol("UnassignedVar " + line));				
						return line;	
					}
				break;
			}
			else if(o == VarList.size() - 1) {
				VarList.add(new Symbol("UnassignedVar " + line));			
				return line;	
			}
		}
		if(this.second instanceof Var)
		for(int o = 0; o < VarList.size(); o++)	
			if(VarList.get(o) instanceof Var) {
			if(((Var) VarList.get(o)).variable().equals(((Var) second).variable())) {
				this.second = ((Var) second).value(((Var) VarList.get(o)).interpret(VarList, line, interpret));
				if(this.second.interpret(VarList, line, interpret) == -1) {
						VarList.add(new Symbol("UnassignedVar " + line));				
						return line;	
					}
				break;
			}
			else if(o == VarList.size() - 1) {
				VarList.add( new Symbol("UnassignedVar " + line));					
				return line;	
			}
		}
		int o = this.second.interpret(VarList, line, interpret);
		if(o != 0)	
			return this.first.interpret(VarList, line, interpret) / o;
		else {
			if(interpret)
				VarList.add( new Symbol("DivideByZero " + line));
			else
				this.first.interpret(VarList, line, interpret);
			return 0;
		}
	}
	
};

class Symbol implements Expression {
	String symbol;

	public Symbol(String symbol) {
		super();
		this.symbol = symbol;
	}
	
	public String symbol() {
		return this.symbol;
	}

	@Override
	public String show() {
		return this.symbol + "\n";
	}

	@Override
	public int interpret(ArrayList<Expression> VarList, int line, boolean interpret) {
		return line;
	}
	
};



