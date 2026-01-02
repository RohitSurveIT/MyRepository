package com.dsa.array;
import java.util.*;

public class LongestConsecutive {
	
	public static int longestConsecutive(int[] nums) {
		if(nums.length==0) return 0;
		Set<Integer>set=new HashSet<>();
		for(int num:nums) {
			set.add(num);	
		}
		int longest=0;
		for(int num:set) {
			if(!set.contains(num-1)) {
				int currentNum=num;
				int length=1;
				
				while(set.contains(currentNum+1)) {
					currentNum++;
					length++;
				}
				longest=Math.max(length, longest);	
			}
		}
		
		return longest;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {100,4,200,1,3,2};
		System.out.println(longestConsecutive(nums));
	}
}
