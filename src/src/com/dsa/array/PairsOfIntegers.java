package com.dsa.array;
import java.util.*;


public class PairsOfIntegers {
		// The Brute force approach time complexity=O(n^2)
//	public static void PairSum(int[] arr) {
//		
//		int target=7;
//		System.out.println("Pairs Are");
//		for(int i=0; i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println(arr[i]+ "+"+ arr[j]+"="+ target);
//				}
//			}
//		}	
	
	
//	The second approach is the optimal solution called the two pointers approach }
	
 public static void PairSum(int[] arr) {
	 
	 int target=7;
	 int n=arr.length;
	 int left=0;
	 int right=n-1;
	 System.out.println("Pairs are");
	 while(left<right) {
		 int sum=arr[left]+arr[right];
		 if(sum==target) {
			 System.out.println(arr[left]+"+"+arr[right]+"="+target);
			 left++;
			 right--;			 
		 }
		 else if(sum<target) {
			 left++; 
		 }
		 else {
			 right--;
		 }
	 }
 }
	
	public static void main(String[] args) {
		int[] arr= {2,4,3,5,7,8,9};
		PairSum(arr);
		// TODO Auto-generated method stub
	}
}
