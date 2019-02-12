import java.lang.Integer;

class MyVisitor extends HelloBaseVisitor<Integer> {
    private int tabs = 0;
	public String show = "";

    // Functie rudimentara pentru a printa tab-uri
    private void printTabs() {
        for (int i = 0; i < this.tabs; i++) {
           this.show += "\t";
        }
    }

	@Override public Integer visitMainNode(HelloParser.MainNodeContext ctx) {
        this.printTabs();
        this.show += "<MainNode>\n";

        this.tabs++;
        visit(ctx.start());
        this.tabs--;

        return 0;
    }

	@Override public Integer visitVarList(HelloParser.VarListContext ctx) {
        return 0;
    }	

	@Override public Integer visitStart(HelloParser.StartContext ctx) {
		if(ctx.stmt() != null)
			visit(ctx.stmt());
		if(ctx.sequenceNode() != null)
			visit(ctx.sequenceNode());
        return 0;
    }	

	@Override public Integer visitSequenceNode(HelloParser.SequenceNodeContext ctx) {
        this.printTabs();
		this.show += "<SequenceNode>\n";

		this.tabs++;
        if (ctx.sequenceNode() != null) {
			visit(ctx.stmt(0));
            visit(ctx.sequenceNode());
        }
		else {
			visit(ctx.stmt(0));
			visit(ctx.stmt(1));
		}
		this.tabs--;

        return 0;
    }

	@Override public Integer visitStmt(HelloParser.StmtContext ctx) {
        if (ctx.assignmentNode() != null) 
            visit(ctx.assignmentNode());
		if (ctx.ifNode() != null) 
        	visit(ctx.ifNode());
		if (ctx.whileNode() != null) 
        	visit(ctx.whileNode());

        return 0;
    }

	@Override public Integer visitAssignmentNode(HelloParser.AssignmentNodeContext ctx) {
        this.printTabs();
		this.show += "<AssignmentNode> =\n";

        this.tabs++;
        visit(ctx.var());
        visit(ctx.aExpr());
        this.tabs--;

        return 0;
    }	

	@Override public Integer visitIfNode(HelloParser.IfNodeContext ctx) {
        this.printTabs();
		this.show += "<IfNode> if\n";
		
        this.tabs++;
        visit(ctx.bExpr());
        visit(ctx.blockNode(0));
		visit(ctx.blockNode(1));
        this.tabs--;

        return 0;
    }

	@Override public Integer visitWhileNode(HelloParser.WhileNodeContext ctx) {
        this.printTabs();
        this.show += "<WhileNode> while\n";

        this.tabs++;
        visit(ctx.bExpr());
        visit(ctx.blockNode());
        this.tabs--;

        return 0;
    }

	@Override public Integer visitBlockNode(HelloParser.BlockNodeContext ctx) {
        this.printTabs();
		this.show += "<BlockNode> {}\n";

        this.tabs++;
		if(ctx.start() != null)
        	visit(ctx.start());
        this.tabs--;

        return 0;
    }

	@Override public Integer visitBracketNode(HelloParser.BracketNodeContext ctx) {
        this.printTabs();
		this.show += "<BracketNode> ()\n";

        this.tabs++;
		if (ctx.aExpr() != null) 
        	visit(ctx.aExpr());
		if (ctx.bExpr() != null) 
			visit(ctx.bExpr());
        this.tabs--;

        return 0;
    }

	@Override public Integer visitBExpr(HelloParser.BExprContext ctx) {
		if (ctx.bracketNode() != null) 
            visit(ctx.bracketNode());
		if (ctx.getChild(0).getText().equals("!")) {
			this.printTabs();
			this.show += "<NotNode> !\n";
			this.tabs++;
			visit(ctx.bExpr(0));
			this.tabs--;
		} 
		if (ctx.getChild(1) != null) {
			if (ctx.getChild(1).getText().equals(">")) {
				this.printTabs();			
				this.show += "<GreaterNode> >\n";
				this.tabs++;
       			visit(ctx.aExpr(0));
       			visit(ctx.aExpr(1));
        		this.tabs--;
			}
			if (ctx.getChild(1).getText().equals("&&")) {
				this.printTabs();	
				this.show += "<AndNode> &&\n";	
				this.tabs++;
       			visit(ctx.bExpr(0));
       			visit(ctx.bExpr(1));
       			this.tabs--;
			}
		}
		if (ctx.aExpr() != null) {
			
		}
		if (ctx.bVal() != null) 
            visit(ctx.bVal());
	
		return 0;
	}

	@Override public Integer visitAExpr(HelloParser.AExprContext ctx) {
		if (ctx.bracketNode() != null) 
            visit(ctx.bracketNode());
		if (ctx.getChild(1) != null) {
			if (ctx.getChild(1).getText().equals("/")) {
				this.printTabs();
				this.show += "<DivNode> /\n";
				this.tabs++;
        		visit(ctx.aExpr(0));
        		visit(ctx.aExpr(1));
       	 		this.tabs--;
			}
			if (ctx.getChild(1).getText().equals("+")) {
				this.printTabs();
				this.show += "<PlusNode> +\n";
				this.tabs++;
        		visit(ctx.aExpr(0));
        		visit(ctx.aExpr(1));
       	 		this.tabs--;
			}
		}
		if (ctx.aVal() != null) 
            visit(ctx.aVal());
		if (ctx.var() != null) 
            visit(ctx.var());

        return 0;
    }

	@Override public Integer visitBVal(HelloParser.BValContext ctx) {
        this.printTabs();
		this.show += "<BoolNode> " + ctx.getText() + "\n";

        return 0;
    }

	@Override public Integer visitAVal(HelloParser.AValContext ctx) {
        this.printTabs();
		this.show += "<IntNode> ";
		visit(ctx.number());

        return 0;
    }

	@Override public Integer visitNumber(HelloParser.NumberContext ctx) {
		this.show += ctx.getText() + "\n";

        return 0;
    }

	@Override public Integer visitVar(HelloParser.VarContext ctx) {
		this.printTabs();
        this.show += "<VariableNode> " + ctx.getText() + "\n";

        return 0;
    }

}
