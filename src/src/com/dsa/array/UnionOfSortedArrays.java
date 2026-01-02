package com.dsa.array;
import java.util.*;
import java.util.Arrays;
public class UnionOfSortedArrays {
	
	public static void Union(int[] arr1,int[] arr2) {
		int n1=arr1.length;
		int n2=arr2.length;
		Set<Integer> st=new LinkedHashSet<>();
		
		for(int i=0;i<n1;i++) {
			st.add(arr1[i]);
		}
		for(int i=0;i<n2;i++) {
			st.add(arr2[i]);
		}
		    int[] union = new int[st.size()];
	        int i = 0;
	        for (int element : st) {
	             union[i++] = element;
	        }
	        System.out.println("The union of the  two arrays is:"+Arrays.toString(union));
	}
	public static void main(String[] args) {
		int[] arr1= {1,1,2,3,4,5};
		int[] arr2= {2,3,4,4,5,6};
		Union(arr1,arr2);
	}
}
