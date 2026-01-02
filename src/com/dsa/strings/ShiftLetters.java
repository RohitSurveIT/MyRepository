package com.dsa.strings;

public class ShiftLetters {
// explanation of the problem statement	
//	String s = "abc";
//    int[] shifts = {3, 5, 9};
//    c --> shift 9 times
//    b --> 9 + 5 times
//    a --> 9+5+3 times
	public static String shiftLetters(String s,int[] Shifts) {
		char[] c=s.toCharArray();
		int totalShift=0;
		for(int i=s.length()-1;i>=0;i--) {
			totalShift=(totalShift+Shifts[i])%26;
			char currentChar=c[i];
			c[i]=(char)('a'+(currentChar-'a'+totalShift)%26);
			
		}
		return new String(c);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="abc";
      int[] Shifts= {3,5,9};
      System.out.println(shiftLetters(s,Shifts));
	}

}
