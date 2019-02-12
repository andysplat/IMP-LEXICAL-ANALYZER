import java.util.*;
import java.util.Stack;

%%
 
%class HelloLexer
%line
%int
%{

  	Stack<Expression> stack = new Stack<>();
	ArrayList<Expression> VarList = new ArrayList<>();
    Expression coolList() {
	Expression x = null;
	while((stack.peek() instanceof Symbol) || (stack.peek() instanceof Var) || (stack.peek() instanceof Number) || (stack.peek() instanceof Plus) || (stack.peek() instanceof Div) || (stack.peek() instanceof Par))
   		if(stack.peek() instanceof Symbol) {
			if(((Symbol) stack.peek()).symbol().equals("int"))
			else if(((Symbol) stack.peek()).symbol().equals("=")) {
				stack.pop();
				x = new Assignment(stack.pop(), x);
				if(stack.peek() instanceof Sequence || stack.peek() instanceof Block)
					return x;
				else if(!(stack.peek() instanceof Main)) {
					stack.push(new Sequence(stack.pop()));
					return x;
				}
				else
					return new Sequence(x);	
			}
			else if(((Symbol) stack.peek()).symbol().equals("+")) {
				stack.pop();
				if(x instanceof Plus)
					x = ((Plus) x).first(new Plus(((Plus) x).first()));
				else
					x = new Plus(x);
			}
		}
		else if(x instanceof Plus) 
			x = ((Plus) x).first(stack.pop());
		else
			x = stack.pop();
		return x;
    }
%}

VarList = "int"
Stmt = "=" | "if" | "else" | "while"
AExpr = "+" | "/" 
BExpr = ">" | "!" | "&&"
AVal = [1-9][0-9]* | 0
BVal = "true" | "false" 
Var = [a-z]+
open_par = "("
close_par = ")"
open_Block = "{"
close_Block = "}"
close_intruction = ";"
ignore = "\n" | ","  | "\t"; 
%%   


{VarList} { stack.push(new Symbol("int")); }
{Stmt}    { stack.push(new Symbol(yytext())); }
{AExpr}   { stack.push(new Symbol(yytext())); }
{AVal}    { if(stack.peek() instanceof Symbol) {
				if(((Symbol) stack.peek()).symbol().equals("/")) {
					stack.pop();
					stack.push(new Div(stack.pop(), new Number(yytext()))); 
				}
				else
					stack.push(new Number(yytext()));
			}
			else
				stack.push(new Number(yytext())); 
}
{BExpr}   {	stack.push(new Symbol(yytext())); }
{BVal}    { if(stack.peek().equals("!")) {
				stack.pop();
				stack.push(new Not(new Bool(yytext())));
			}
			else
				stack.push(new Bool(yytext()));
}
{Var}     { if(stack.peek() instanceof Symbol) {
				if(((Symbol) stack.peek()).symbol().equals("int"))
					VarList.add(new Var(yytext()));
				else if(((Symbol) stack.peek()).symbol().equals("/")) {
					stack.pop();
					stack.push(new Div(stack.pop(), new Var(yytext()))); 
				}
				else
					stack.push(new Var(yytext()));
			}
			else
					stack.push(new Var(yytext())); 
}
{open_par}    { stack.push(new Par(null)); }
{close_par}   { Expression x = null;
				Expression y = null;
		while(true) {
			if (stack.peek() instanceof Par)
				if(((Par) stack.peek()).Expression() == null)
					break; 
			if(stack.peek() instanceof Symbol) {
				if(((Symbol) stack.peek()).symbol().equals("+")) {
					stack.pop();
					if(x instanceof Plus)
						x = ((Plus) x).first(new Plus(((Plus) x).first()));
					else if(x instanceof Greater) {
							
							if(((Greater) x).first() instanceof Plus)
								x = ((Greater) x).first(((Plus) ((Greater) x).first()).first(new Plus(((Plus) ((Greater) x).first()).first())));
							else
								x = ((Greater) x).first(new Plus(((Greater) x).first()));
					}
					else
						x = new Plus(x);
					}
				else if(((Symbol) stack.peek()).symbol().equals(">")) {
					stack.pop();
					x = new Greater(stack.pop() , x);
				} 
				else if(((Symbol) stack.peek()).symbol().equals("&&")) {
					stack.pop();
					if(y instanceof And)
						y = ((And) y).first(new And(x));
					else
						y = new And(x);
					x = null;
				}
			}
			else if(x instanceof Plus)
				x = ((Plus) x).first(stack.pop());
			else if(x instanceof Greater) {
							if(((Greater) x).first() instanceof Plus)
								x = ((Greater) x).first(((Plus) ((Greater) x).first()).first(stack.pop()));
			}
			else {
				x = stack.pop();
			}
		}
		if(y instanceof And) {
			x = ((And) y).first(x);
		}
		stack.pop();	
		x = new Par(x);
		if(stack.peek() instanceof Symbol) {
			if(((Symbol) stack.peek()).symbol().equals("if")) {
				x = new If(x);	
				stack.pop();
			} 
			else if(((Symbol) stack.peek()).symbol().equals("!"))  {
				x = new Not(x);	
				stack.pop();
			} 
			else if(((Symbol) stack.peek()).symbol().equals("while"))  {
				x = new While(x);	
				stack.pop();
			} 
			else if(((Symbol) stack.peek()).symbol().equals("/"))  {
				stack.pop();
				x = new Div(stack.pop(), x);	
			} 
		}
		stack.push(x);
}
{open_Block}    { stack.push(new Block(null)); }
{close_Block}   {
		Expression x = stack.pop();
		if(!(x instanceof Block)) {
		while(!(stack.peek() instanceof Block)) 
			if(stack.peek() instanceof Sequence)
				x = ((Sequence) stack.pop()).second(x);
		x = new Block(x);
		stack.pop();
		}
		if(stack.peek() instanceof If) {
			x = ((If) stack.pop()).first(x);
			stack.push(x);
		}
		else if(stack.peek() instanceof Symbol)  {
			if(((Symbol) stack.peek()).symbol().equals("else")) {
					stack.pop();
					x = ((If) stack.pop()).second(x);
					if(stack.peek() instanceof Sequence || stack.peek() instanceof Block)
						stack.push(x);	
					else if(!(stack.peek() instanceof Main)) {
						stack.push(new Sequence(stack.pop()));
						stack.push(x);	
					}
					else 
						stack.push(new Sequence(x));
			}
		}	
		else if(stack.peek() instanceof While) {
			x = ((While) stack.pop()).expression(x);
			if(stack.peek() instanceof Sequence || stack.peek() instanceof Block)
				stack.push(x);	
			else if(!(stack.peek() instanceof Main)) {
				stack.push(new Sequence(stack.pop()));
				stack.push(x);	
			}
			else 
				stack.push(new Sequence(x));
		}
}
{close_intruction} { Expression x = coolList(); // scot ce am pe stiva pana dau de ";" si formez elementul
	if(!(x instanceof Symbol)) 
		stack.push(x); // pun elementul nou format la loc pe stiva
	else if(!(((Symbol) x).symbol().equals("int")))
    	stack.push(x); // pun elementul nou format la loc pe stiva	
	else {
		stack.pop(); // Scoatem "int" de pe stiva
		stack.push(new Main(null));
	}
}
{ignore}  {}
. {}


