package com.dsa.array;

import java.util.Arrays;

public class SingleElement3 {
	
	
	public static int[] singleElement(int[] nums) {
		
		int XOR=0;
		for(int num:nums) {
			XOR^=num;
			
		}
		
		int diff=XOR & (-XOR);
		int x=0,y=0;
		for(int num:nums) {
			if((num&diff)!=0) {
				x^=num;
				
			}
			else {
				y^=num;
			}
			
		}
		return new int[] {x,y};
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,5,1,2};
		System.out.println(Arrays.toString(singleElement(nums)));

	}

}
