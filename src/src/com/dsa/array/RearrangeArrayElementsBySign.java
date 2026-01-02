package com.dsa.array;
import java.util.*;

public class RearrangeArrayElementsBySign {
	
	// The slightly more optimal solution time complexity of O(1)
	
	public static void Rearrange(int[] nums) {
		int n=nums.length;
		int[] pos=new int[n/2];
		int[] neg=new int[n/2];
		int i;
		int j=0;
		int k=0;
		for(i=0;i<n;i++) {
			if(nums[i]>=0) {
				pos[j++]=nums[i];
			}
			else {
				neg[k++]=nums[i];
			}
			
		}
		int po=pos.length;
		int ne=neg.length;
		if(po>ne) {
			for(i=0;i<ne;i++) {
				nums[i*2]=pos[i];
				nums[i*2+1]=neg[i];
			}
			int index=ne*2;
			for(i=ne;i<po;i++) {
				nums[index++]=pos[i];				
			}
		}
		else {
			for(i=0;i<po;i++) {
				nums[i*2]=pos[i];
				nums[i*2+1]=neg[i];	
				
		}     int index=po*2;
			for(i=po;i<ne;i++) {
				nums[index++]=neg[i];				
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}
		
		
		
	
	
	
	
	
	
	// This is a brute force approach 
//	public static void Rearrange(int[] nums) {
//		int n=nums.length;
//		int[] pos=new int[n/2];
//		int[] neg=new int[n/2];
//		int i;
//		int j=0;
//		int k=0;
//		for(i=0;i<n;i++) {
//			if(nums[i]>=0) {
//				pos[j++]=nums[i];
//			}
//			else {
//				neg[k++]=nums[i];
//			}
//			
//		}
//		for(i=0;i<n/2;i++) {
//			nums[i*2]=pos[i];
//			nums[i*2+1]=neg[i];
//		}
//		
//		System.out.println(Arrays.toString(nums));
//	    }
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,1,-2,-5,2,-4};
		Rearrange(nums);

	}

}
