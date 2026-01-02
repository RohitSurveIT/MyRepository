package com.dsa.array;
import java.util.Arrays;

public class ArrayOf012Sort {
	
	
	static String Sort(int nums[]) {
		
		int count0=0,count1=0,count2=0;
		int n=nums.length;
		
		for(int i=0;i<n;i++) {
			if(nums[i]==0) {
				count0+=1;
			}
			else if(nums[i]==1) {
				count1+=1;
				
			}
			else{ 
				count2+=1;
			}
		}
		
		
		for(int i=0;i<count0;i++) {  
			nums[i]=0;	
		}
		for(int  i=count0;i<count0+count1;i++) {
			nums[i]=1;
			
		}
		for(int i=count0+count1;i<n;i++) {
			nums[i]=2;
		}
		
		
		return (Arrays.toString(nums));
	}
	
	

	public static void main(String[] args) {
		int nums[]= {0,1,2,0,1,2,0,1,2,0,0,1};
		System.out.println(Sort(nums));

	}
	
}
