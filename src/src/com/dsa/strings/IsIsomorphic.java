package com.dsa.strings;
import java.util.*;

public class IsIsomorphic {
	
	
	public static boolean isIsomorphic(String s,String t) {
		if(s.length()!=t.length()){
			return false;
		}
	Map<Character,Character> charMap=new HashMap<>();
	for(int i=0;i<s.length();i++) {
		char original=s.charAt(i);
		char replacement=t.charAt(i);
		
		if(!charMap.containsKey(original)) {
			if(!charMap.containsValue(replacement)) {
				charMap.put(original, replacement);
			}
				else {
					return false;
				}
			}
		else {
			char mappedchar=charMap.get(original);
			if(mappedchar!=replacement) {
				return false;
			}
		}
		
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="paper";
      String t="title";
      System.out.println(isIsomorphic(s,t));
	}

}
