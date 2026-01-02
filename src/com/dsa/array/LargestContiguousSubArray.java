package com.dsa.array;
import java.util.*;

public class LargestContiguousSubArray {

	// the below code gives  the time complexity of big O n^2
	// But the most efficient  way to solve this problem is by using the  kadanes  algo 
	
	public static void  LargestSubArray( int[] arr) {
		int maxi=Integer.MIN_VALUE;
		int n=arr.length;
		int sum;
		for(int  i=0;i<n;i++) {
			sum=0;
			for(int  j=i;j<n;j++) {
				sum+=arr[j];
				maxi=Math.max(maxi, sum);
			}
		}
		System.out.println(maxi);
		
	}
	// now lets solve this problem using  the kadanes  algorithm
	// The time complexity for this problem would be O(n) and the space complexity would  be O(1);
	
	public static void  KadanesAlgorithm(int[] nums) {
		int m=nums.length;
		int maxi=Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0;i<m;i++) {
			sum+=nums[i];
			if(sum>maxi) {
				maxi=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(maxi);
	}
	
	public static void main(String[] args) {
		int[] arr= {-2,-3,4,-1,-2,1,5,-3};
		int[] nums= {-2,-3,4,-1,-2,1,5,-3};
		LargestSubArray(arr);
		KadanesAlgorithm(nums);
	}

}
