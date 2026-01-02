package com.dsa.array;
import java.util.Arrays;

// one more approch to this problem is sorting the array first then printing it when the ORDER MATTERS!!!
// The approach is sorting the array using the inbuilt Arrays.sort(arr);
public class MoveNegativesToOneSide {
	
	public static void MoveNegativesToLeft(int arr[]) {
		
		int temp,i,j=0;
		int n=arr.length;
		
		for(i=0;i<n;i++) {
			if(arr[i]<0) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			
		}
	
	}

	public static void main(String[] args) {
		
		int arr[]= {3,2,-1,-3,-5,6,7,-9};
	    MoveNegativesToLeft(arr);
		System.out.println(Arrays.toString(arr));
	}

}
