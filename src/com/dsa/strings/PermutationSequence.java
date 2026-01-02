package com.dsa.strings;
import java.util.*;

public class PermutationSequence {
	
	int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		return fact;
	}
		
	public  String getPermutation(int n,int k ) {
		List<Integer> nums=new ArrayList<>();
		for(int i=1;i<n+1;i++) {
			nums.add(i);
		}
		
		int[] result=new int[n];
		int i=0;		
		k--;
		while(!nums.isEmpty()) {
			
			int index=k/factorial(n-1);
			int value=nums.get(index);
			result[i++]=value;
			nums.remove(index);		
			k=k%factorial(n-1);
			n--;
			
		}
		StringBuilder sb=new StringBuilder();
		for(int num:result) {
			sb.append(num);
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PermutationSequence ps=new PermutationSequence();
     System.out.println(ps.getPermutation(4,17));
	}

}
