package com.dsa.strings;

public class ShuffleStrings {
//	Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
//	Output: "leetcode"
//	Explanation: As shown, "codeleet" becomes "leetcode" after shuffling
	
	public static String shuffleString(String s,int[] indices) {
		int n=s.length();
		char[] result=new char[n];
		for(int i=0;i<n;i++) {
			int digit=indices[i];
			result[digit]=s.charAt(i);
		}
		s=new String(result);
		return  s;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="codeleet";
	    int[] indices= {4,5,6,7,0,2,1,3};
	    System.out.println(shuffleString(s,indices));

	}

}
