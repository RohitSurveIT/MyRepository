package com.dsa.strings;

public class StringCompression {
	public static int compress(char[] chars) {
		int n=chars.length;
		int write =0;
		int i=0;
		while(i<n) {
			
			char current=chars[i];
			int count =0;
			
			// count number of same characters
			while(i<n && chars[i]==current) {
				i++;
				count++;
			}
			// write the character
			   chars[write++]=current;
			// write the count (if>1)
			   if(count>1) {
				   for(char c:String.valueOf(count).toCharArray()) {
					   chars[write++]=c;
				   }
			   }
		}
		
		return write;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars= {'a','a','b','b','c','c','c'};
		System.out.println(compress(chars));

	}

}
