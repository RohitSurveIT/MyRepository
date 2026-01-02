package com.dsa.array;

import java.util.Arrays;

public class ConcatenationOfArray {
	// input nums=[1234]    output ans[12341234]
	
	public int[] getConcatenation(int[] nums) {
		int n=nums.length;
		int[] ans=new int[2*n];
		for(int i=0;i<n;i++) {
			ans[i]=nums[i];
			ans[i+n]=nums[i];
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4};
		ConcatenationOfArray c=new ConcatenationOfArray();
		int[] result=c.getConcatenation(nums);
		System.out.println(Arrays.toString(result));
		

	}

}
