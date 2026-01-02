package com.dsa.strings;

public class FindIndex {
//	Given two strings needle and haystack, 
//	return the index of the first occurrence 
//	of needle in haystack, or -1 if needle is not part of haystack.
	
	
	public static int findIndex(String haystack,String needle) {
		return  haystack.indexOf(needle); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack="saebutsad";
		String needle="sad";
		System.out.println(findIndex(haystack,needle));
		//output is 6

	}

}
