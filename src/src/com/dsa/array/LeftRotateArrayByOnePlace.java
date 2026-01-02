package com.dsa.array;
import java.util.Arrays;
import java.util.*;

public class LeftRotateArrayByOnePlace {
	
	public static void LeftRotateArray(int[] arr) {
	
		int n=arr.length;
		int first=arr[0];
		
		for(int i=1;i<n;i++) {
			arr[i-1]=arr[i];
			
			
		}
		arr[n-1]=first;
		
	}
	

	public static void main(String[] args) {
	
		int[] arr= {1,2,3,4,5};
		LeftRotateArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
