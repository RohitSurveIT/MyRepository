package com.dsa.strings;

public class ReverseWordsInStrings {
	
	public static String reverseWords(String s) {
		
		StringBuilder sb=new StringBuilder();
		 String[] words=s.split(" +");
		 
		 for(int i=words.length-1;i>=0;i--) {
			 sb.append(words[i]);
			 sb.append(" ");
		 }
		 return sb.toString().trim(); 
	}
	public static void main(String[] args) {
		String s=" Hello  world ";
		System.out.println(reverseWords(s));
	}
}
