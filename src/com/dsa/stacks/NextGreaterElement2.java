package com.dsa.stacks;

import java.util.Arrays;
import java.util.*;

public class NextGreaterElement2 {
	
	public static int[] nextGreaterElement2(int[] nums) {
		int n=nums.length;
		int[] nums1=new int[2*n];
		for(int i=0;i<n;i++) {
			nums1[i]=nums[i];
			nums1[n+i]=nums[i];
			
		}
		int m=nums1.length;
		int[] result=new int[m];
		Arrays.fill(result, -1);
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<m;i++) {
			while(!stack.isEmpty() && nums1[i]>nums1[stack.peek()]) {
				int index=stack.pop();
				result[index]=nums1[i];
			}
			stack.push(i);
		}
		int[] result1=new int[n];
		for(int i=0;i<n;i++) {
			result1[i]=result[i];
		}
		return result1;
		
		}
	
		
	
		
		
	

	public static void main(String[] args) {
		int[] nums= {1,2,1};
		System.out.println(Arrays.toString(nextGreaterElement2(nums)));
		
		// TODO Auto-generated method stub

	

}
}
