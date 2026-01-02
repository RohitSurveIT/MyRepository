package com.dsa.strings;

//Given two strings s and t, return true if s is a subsequence of t, 
//or false otherwise.
//A subsequence of a string is a new string that is formed from the original 
//string by deleting some (can be none) of the characters without disturbing 
//the relative positions of the remaining characters. 
//(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
public class IsSubSequence {
	
	
	public static boolean isSubsequence(String  s,String t) {
		int n=s.length();
		int m=t.length();
		int i=0;
		int j=0;
		while(i<n && j<m) {
			if(s.charAt(i)!=s.charAt(j)) {
				j++;
			}
			else {
				i++; j++;
			}
		}
		if(i<n) {
			return false;
		}
		return true ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="abc";
		String  t="atbuvc";
		System.out.println(isSubsequence(s,t));

	}

}
