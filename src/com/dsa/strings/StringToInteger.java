package com.dsa.strings;
import java.util.*;

public class StringToInteger {
	
	
	public static long atoi(String s) {
		s=s.trim();
		int n=s.length();
		int i=0;
	    int sign=1;
	    long num=0;
	    
	    if(s.isEmpty()) {
	    	return 0;
	    }
	    
	    if(s.charAt(i)=='-'|| s.charAt(i)=='+') {
	    	sign=(s.charAt(i)=='-')?-1:1;
	    	i++;
	    }
	    while(i<n && Character.isDigit(s.charAt(i))) {
	    	num=num*10+(s.charAt(i)-'0');
	    	if((sign*num)>Integer.MAX_VALUE) {
	    		return Integer.MAX_VALUE;
	    	}
	    	if((sign*num)<Integer.MIN_VALUE) {
	    		return  Integer.MIN_VALUE;
	    	}
	    	i++;
	    	
	    }
	   
	     
		return sign*num;
	}


	public static void main(String[] args) {
		String s="1337c0d3";
		System.out.println(atoi(s));
		// TODO Auto-generated method stub

	}

}
