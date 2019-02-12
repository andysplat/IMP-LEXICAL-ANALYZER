// Author: Vlad Nedelcu

import java.io.*;
import java.util.*;

public class Parser {
	public static String addNewline(String print) {
		Scanner scanner = new Scanner(print);
		String build = "";
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			build += "\t" + line + "\n";
		}
		scanner.close();
		return build;
	}
	
	public static void main (String[] args) throws IOException {
		String print = "";
		PrintWriter printWriter = null;
		HelloLexer l = new HelloLexer(new FileReader("input"));

		l.yylex();
		Expression x = l.stack.pop();
		while(!(l.stack.peek() instanceof Main)) 
			if(l.stack.peek() instanceof Sequence)
				x = ((Sequence) l.stack.pop()).second(x);
		l.stack.pop();
		l.stack.push(new Main(x));
	
		l.stack.peek().interpret(l.VarList, 0, true);
		for(Expression var : l.VarList) 
			if(var instanceof Var) {
			print += ((Var) var).variable() + "=";
			int o = ((Var) var).interpret(l.VarList, 0, true);
			if(o != -1)
				print += o;
			else
				print += null;
			print += "\n";
			}
			else {
			print = var.show();
			break;
			}
		//Systemout.println(print);
		printWriter = new PrintWriter(new FileWriter("output"));
		printWriter.printf("%s", print);
		printWriter.close();
		print = l.stack.pop().show();
		//System.out.println(print);
   	 	printWriter = new PrintWriter(new FileWriter("arbore"));
		printWriter.printf("%s", print);
		printWriter.close();
		//System.out.println(((ExprList) l.stack.pop()).interpret().show());

	}
}
