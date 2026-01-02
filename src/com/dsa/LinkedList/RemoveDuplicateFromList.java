package com.dsa.LinkedList;

public class RemoveDuplicateFromList {
	// This is a problem number 83 from leetcode which was a easy two 
	//pointers question but it took me a lot of effort finally i needed to see
	//the solution which i understood quickly
	//in this we just need to delete the duplicate elements in an LinkedList 
	//return the sorted list 
	public ListNode removeDuplicate(ListNode head) {
		ListNode prev=head;
		ListNode temp=prev.next;
		
		if(head==null || head.next==null) {
			return null;
		}
		
		while(temp!=null) {
			if(temp.val==prev.val) {
				temp=temp.next;
				continue;
			   
			}
			prev.next=temp;
			prev=temp;
			temp=temp.next;
		}
		temp.next=null;
		return head;
		
		
	}

}
