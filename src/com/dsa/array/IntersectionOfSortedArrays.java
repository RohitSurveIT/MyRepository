package com.dsa.array;
import java.util.*;
public class IntersectionOfSortedArrays {

	public static void Intersection(int[] arr1,int[] arr2) {
		
		
		int n1=arr1.length;
		int n2=arr2.length;
		int i=0,j=0,k=0;
		int[] ans=new int[10];
		
		while(i<n1 && j<n2) {
		     if (arr1[i] == arr2[j]) {
	                ans[k++] = arr1[i];
	                i++;
	                j++;
	            } else if (arr1[i] < arr2[j]) {
	                i++;
	            } else {
	                j++;
	            }
		}
		for(int a=0;a<k;a++) {
			System.out.println(ans[a]);
		
		}	
	}
	public static void main(String[] args) {
		int[] arr1= {1,1,2,3,4,5};
		int[] arr2= {2,3,4,4,5,6};
		Intersection(arr1,arr2);
}
}
