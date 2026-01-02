package com.dsa.strings;

public class RepeatedStringMatch {
	
	
	public static int repeatedStringMatch(String a,String b) {
		
		StringBuilder sb=new StringBuilder(a);
		int count=1;
		
		while(sb.length()<b.length()) {
			sb.append(a);
			count++;
		}
		if(sb.toString().contains(b)) return count;
		sb.append(a);
		if(sb.toString().contains(b)) return count+1;
	
		return -1;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcd";
		String b="cdabcdab";
		System.out.println(repeatedStringMatch(a,b));

	}

}
