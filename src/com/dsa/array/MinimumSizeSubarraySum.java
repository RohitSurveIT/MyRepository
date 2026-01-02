package com.dsa.array;
import java.util.*;
public class MinimumSizeSubarraySum {
	
	static int minLenSubArrayLen(int target,int[]  nums) {
		
		int minLenWindow=Integer.MAX_VALUE;
		int currentSum=0;
		
		// Start 2 pointers Sliding Window
		
		int low=0;
		int high=0;
		while(high<nums.length) {
			
			// Find the current sum and increase the window size
			currentSum+=nums[high];
			high++;
			
			// Try reducing the window size from the start
			while(currentSum>=target) {
				int currentWindowSize=high-low;
				
				//update minimum length of the window 
				
				minLenWindow=Math.min(minLenWindow, currentWindowSize);
				currentSum-=nums[low];
				low++;
			}
		}
		return minLenWindow==Integer.MAX_VALUE?0:minLenWindow;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {2,3,1,2,4,3};
		int target=7;
		System.out.println(minLenSubArrayLen(target,nums));

	}

}
