package com.dsa.array;

public class SingleElementInSortedArrayOptimized {

	
		
		
		
		static int single(int[] arr) {
			
			
			int n=arr.length;
			
			int i ,mid = 0, high=n-2 ,low = 1;
			i=0;
			if(arr[0]!=arr[0+1]) {
				return arr[0];
				
			}
			if(arr[n-1]!=arr[n-2]) {
				return arr[n-1];
			}
		    
			while(low<=high) {
				mid = low + (high - low) / 2;

				
				if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) {
					return arr[mid];
					
				}
				if((mid%2==1 && arr[mid-1]==arr[mid]) || (mid%2==0 && arr[mid]==arr[mid])){
					low=mid+1;
					
				}
				  else{
					high=mid-1;
				}
				
			
			}
			return 0;

	}

	
	public static void main(String[] args) {
		int[] arr= {1,1,3,3,5,5,4,6,6,7,7};
		System.out.println(single(arr));
		
		
		//  if(arr[i]!=arr[i+1]) return arr[i];
		
		
		
	}
	

}
