package com.dsa.array;

public class SingleElementInSortedArrayXOR {
	
	static int single(int[] arr) {
		 int n=arr.length;
		 int i;
		 int XOR=0;
		 for(i=0;i<n;i++) {
			 XOR^=arr[i];
		 }
         return XOR;
	
	 }
	

	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,4,4,5,5,7,7};
		 
		System.out.println(single(arr));
		
		
	}
}





