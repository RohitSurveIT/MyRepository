package com.dsa.array;

// 1) Using Brute-force approach

public class SingleElementInSortedArrayBruteForce {
	
	// 1) Using Brute-force approach
	
	 static int single(int[] arr) {
		 int n=arr.length;
			int i;
			
			for(i=0;i<n-1;i+=2) {
				if(arr[i]!=arr[i+1]) {
				return arr[i];
				
				}
		}
			return arr[n-1];
			
		}
	 
	 //2 Using Brute-force approach2
	 
	 static int single1(int[] arr) {
		 int n=arr.length;
		 int i;
		 if(n==1) {
			 return arr[0];
		 }
		 for(i=0;i<n;i++) {
			 if(i==0 && arr[i]!=arr[i+1]) {
				 return arr[i];
			 }
			 else if(i==n-1 && arr[i]!=arr[i-1]) {
				 return arr[i];
			 }
			 else if(arr[i]!=arr[i+1] && arr[i]!=arr[i-1] ){
				 return arr[i];
			 }
			 
			 
				 
				 
			 
		 }
		 return 0;
		 
	 }
	 
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,4,4,5,5,7,7};
		
		System.out.println(single(arr));
		System.out.println(single1(arr));
	}
	}



 // 


		
		
	

	 
	 
	 
	 
		
	


