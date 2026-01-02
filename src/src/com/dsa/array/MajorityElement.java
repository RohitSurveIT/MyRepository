package com.dsa.array;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
		 // The brute force approach 
		// lets go with the brute force approach
//		   int n=nums.length;
//		   for(int i=0;i<n;i++) {
//			   int count=0;	  
//			   
//			   for(int j=0;j<n;j++) {
//				   if(nums[i]==nums[j]) count++;
//			   
//				   if(count>n/2) return nums[i];
//		   }
//		}
//		   return -1;
//	}
	
		

		// More optimal solution for this can be the moores Voting algorithm
		
		int ele=nums[0];
		int count=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]==ele) count++;
			else count--;
			
			if(count==0) {
				ele=nums[i];
				count=1;
			}
		} return ele;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,2,1,2,4,2};
		System.out.println(majorityElement(nums));
}
}
