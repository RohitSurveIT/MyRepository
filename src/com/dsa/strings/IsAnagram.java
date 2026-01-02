package com.dsa.strings;
import java.util.*;

public class IsAnagram {
	
	
	public static boolean isAnagram(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		Map<Character,Integer> charMap=new HashMap<>();
		char[] s1=s.toCharArray();
		char[] t1=t.toCharArray();
		
		// count frequencies of characters in first string 
		for(char c:s1) {
			charMap.put(c, charMap.getOrDefault(c,0)+1);
		}
		
		// for each element in t ,check if it is available in s
		
		for(char c:t1) {
			if(!charMap.containsKey(c) || charMap.get(c)==0) {
				return false;
			}
			charMap.put(c, charMap.get(c)-1);
		}
	
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="anagram";
        String t="naagram";
        System.out.println(isAnagram(s,t));
	}

}
