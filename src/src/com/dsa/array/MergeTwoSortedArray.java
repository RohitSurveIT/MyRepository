	package com.dsa.array;
import java.util.*;

public class MergeTwoSortedArray {
	public static void merge1(long[] arr1,long[] arr2,int n,int m) {
		// First We are gonna solve the problem using the third array
		// compare every element from array 1 with every element in array 2
		// This is basically a brute force approach and  TC=O(n+m)+O(n+m) SC=O(n+m)
		long[] arr3 = new long[n+m];
		int left=0;
		int right=0;
		int index=0; 
		while(left<n && right<m) {
			if(arr1[left]<=arr2[right]) {
				arr3[index]=arr1[left];
				left++; index++;	
			}
			else {
				arr3[index]=arr2[right];
				right++; index++;
			}
		}
		while(left<n) {
			arr3[index++]=arr1[left++];
		}
		while(right<m) {
			arr3[index++]=arr2[right++];		
		}
		// removing elements from array3 and putting them back to their respective arrays 
		
		for(int i=0;i<n+m;i++) {
	     if(i<n) {
	    	 arr1[i]=arr3[i];
	     }
	     else {
	    	 arr2[i-n]=arr3[i];
	     }
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}	
	public static void merge2(long[] arr1,long[] arr2,int n,int m) {
		// a more optimized solution for this can be a two pointers approach
		// Start with the last element of right array && first element  of left array
		int left=n-1;
		int right=0;
		while(left>=0 && right<m) {	
			if(arr1[left]>arr2[right]) {
				swap( arr1,arr2, right , left);
				left--; right++;
				  
					
				}
			else {
				break;
			}
			}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		}
	public static void merge3(long[] arr1,long[] arr2,int n, int m) {
		// The most optimized solution to this problem is to use GAP method (Shell Sort)
		// First take the ceil value of the both the arrays 4+5/9 = 5 
		// Put the first pointer on the 1st element & second pointer on 5 gaps of 1st element 
		// Compare both the elements and switch the smaller with the larger one move both the pointer
		// forward even if swap is performed
		// The moment right pointer moves out of bounds stop and restart
		// next time restart by reducing the value of Gap 5/2=3
	
		    int len = n + m;
		    int gap = (len / 2) + (len % 2);

		    while (gap > 0) {
		        int left = 0, right = left + gap;

		        while (right < len) {
		            // Case 1: both in arr1
		            if (left < n && right < n) {
		                if (arr1[left] > arr1[right]) {
		                    long temp = arr1[left];
		                    arr1[left] = arr1[right];
		                    arr1[right] = temp;
		                }
		            }
		            // Case 2: left in arr1, right in arr2
		            else if (left < n && right >= n) {
		                if (arr1[left] > arr2[right - n]) {
		                    long temp = arr1[left];
		                    arr1[left] = arr2[right - n];
		                    arr2[right - n] = temp;
		                }
		            }
		            // Case 3: both in arr2
		            else {
		                if (arr2[left - n] > arr2[right - n]) {
		                    long temp = arr2[left - n];
		                    arr2[left - n] = arr2[right - n];
		                    arr2[right - n] = temp;
		                }
		            }

		            left++;
		            right++;
		        }

		        if (gap == 1) break;
		        gap = (gap / 2) + (gap % 2);
		    }

		    System.out.println(Arrays.toString(arr1));
		    System.out.println(Arrays.toString(arr2));
		

		
		
	}
	public static void swap(long[] arr1, long[] arr2,int right,int left) {
		long temp=arr1[left];
		arr1[left]=arr2[right];
		arr2[right]=temp;
	
	}
	
	public static void main(String[] args) {
		long[] arr1= {1,3,5,7};
		long[] arr2= {0,2,6,8,9};
		int n=arr1.length;
		int m=arr2.length;
		merge1(arr1,arr2,n,m);	
		merge2(arr1,arr2,n,m);
		merge3(arr1,arr2,n,m);
	}
}
