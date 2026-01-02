package com.dsa.array;

public class ReverseArray {
	
	
	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5};
		
		int n=arr.length;
		int mid=n/2;
		int i;
		int temp = 0;
		for(i=0;i<mid;i++) {
			temp=arr[i];
		    arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
			
		}
		
		for(i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
