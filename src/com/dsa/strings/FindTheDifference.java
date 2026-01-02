package com.dsa.strings;

public class FindTheDifference {
	
	public static char findTheDifference(String s,String t) {
		int xor=0;
		for(char c:s.toCharArray()) {
			xor^=c;
		}
		for(char c:t.toCharArray()) {
			xor^=c;
		}
		return (char) xor;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="abcd";
       String t="abcde";
       System.out.println(findTheDifference(s,t));
	}

}
