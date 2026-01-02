package com.dsa.strings;
import java.util.*;
//You are given two 0-indexed strings s and target. You can 
//take some letters from s and rearrange them to form new strings.
//Return the maximum number of copies of target 
//that can be formed by taking letters from s and rearranging them.
//Example 1:
//Input: s = "ilovecodingonleetcode", target = "code"
//Output: 2


public class RearrangeCharactersToFormTargetString {
	
	public static int rearrangeCharacters(String s,String target) {
		Map<Character,Integer> charMap=new HashMap<>();
		Map<Character,Integer> targetMap=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			charMap.put(c, charMap.getOrDefault(c,0)+1);
		}
		// make a similar map for target also
		for(int i=0;i<target.length();i++) {
			char c=target.charAt(i);
			targetMap.put(c, targetMap.getOrDefault(c,0)+1);
		}
		int minCount=Integer.MAX_VALUE;
		for(char c:targetMap.keySet()) {
			if(!charMap.containsKey(c)) {
			return 0;
			}
		
		int possible=charMap.get(c)/targetMap.get(c);
		minCount=Math.min(minCount, possible);
		}
		
		return minCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ilovecodingonleetcode";
		String target="code";
		System.out.println(rearrangeCharacters(s,target));
	}

}
