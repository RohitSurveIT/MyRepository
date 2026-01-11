package com.dsa.stacks;
import java.util.*;

public class EvaluateReversePolishNotation {
	public static int evalPRN(String[] tokens) {
		Stack<Integer> stack=new Stack<>();
		String operators="+-*/";
		for(String token:tokens) {
			if(operators.indexOf(token)!=-1) {
				int t2=stack.pop();
				int t1=stack.pop();
				int result=0;
				if(token.equals("+")) {
					result=t1+t2;
				}
				else if(token.equals("-")) {
					result=t1-t2;
				}
				else if(token.equals("*")) {
					result=t1*t2;
				}
				else if(token.equals("/")) {
					result=t1/t2;
				}
				stack.push(result);
		}
			else {
				stack.push(Integer.parseInt(token));
			}
		}
		return stack.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String[] tokens = {"2","1","+","3","*"};
       System.out.println(evalPRN(tokens));
       
	}

}
