package com.dsa.array;
import java.util.*;

public class IsArraySubset {
	
	public static boolean isarraySubset(int[] a,int[]  b) {
	
		Map<Integer,Integer> freq =new HashMap<>();
		
		//put the elements of array a[] into the Hashmap
		for(int num:a) {
			freq.put(num, freq.getOrDefault(num, 0)+1);
		}
		
		// for each element in b,check if its available in a
		for(int num:b) {
			if(!freq.containsKey(num) || freq.get(num)==0 ) {
				return false;
			}
			freq.put(num, freq.get(num)-1);
		}
		
		
		// the above apprach is optimal one because we get the time complexity of the solution as O(n)
		
		return true;
		// Lets do it with a brute force approach 
		
//		int n=b.length;
//		int m=a.length;
//		for(int i=0;i<n;i++) {
//			boolean found=false;
//			for(int j=0;j<m;j++) {
//				if(a[j]==b[i]) {
//					found=true;
//					a[j]=Integer.MIN_VALUE;
//					break;
//				}
//			}
//			if(!found) {
//				return false;
//			}
//		}
//		
//		return true;
		
	}

	public static void main(String[] args) {
		int[] a= {11,7,1,13,21,3,7,3};
		int[] b= {11,3,7,1,7};
		System.out.println(isarraySubset(a,b));
		// TODO Auto-generated method stub

	}

}
