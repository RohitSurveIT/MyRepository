package com.dsa.array;
import java.util.*;

public class KthElementInTheArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		int nums[]= {2,5,7,4,9};
		int k=2;
		for( int num :nums) {
			pq.add(num);
			if(pq.size()>k) {
				pq.remove();
			}
			
		}
		System.out.println(pq.peek());
		
		
		

	}

}
