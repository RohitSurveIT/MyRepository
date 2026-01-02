package com.dsa.strings;
import java.util.*;

public class FirstUniqueCharacterInAString {
	
	//Given a string s, find the first non-repeating character in it and return its index. 
	//If it does not exist, return -1
	//Input: s = "leetcode"

    //Output: 0
    //Explanation:
    //The character 'l' at index 0 is the first character that does not occur at any other index
	
	
	public static  int firstuniqueChar(String s) {
		Map<Character,Integer> charMap=new HashMap<>();
		char[] s1=s.toCharArray();
		for(char c:s1) {
			charMap.put(c, charMap.getOrDefault(c,0)+1);
		}
		for(int i=0;i<s.length();i++) {
			if(charMap.get(s.charAt(i))==1) {
				return i;
				
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="leetcode";
		System.out.println(firstuniqueChar(s));

	}

}
