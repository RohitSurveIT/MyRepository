package com.dsa.array;

public class MaximumAndMinimumInArray {

	public static void main(String[] args) {
		
		
		int arr[]= {1,4,76,45,6,2};
	    int  n =arr.length;
	    int max=arr[0];
	    int min=arr[0];
	    
	    
	    for(int  i=1;i<n;i++) {
	    	if(arr[i]>max) {
	    		max=arr[i];
	    	}
	    }
	    System.out.println("The maximum number in the array is:" +max);
	    
	    for(int j=1;j<n;j++) {
	    	if(arr[j]<min) {
	    		min=arr[j];
	    		
	    	}
	    }
	    
	    System.out.println("The minimum number in the array is:" +min );
	    

}
}
