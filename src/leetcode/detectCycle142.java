package leetcode;

import java.util.HashMap;

import util.ListNode;

public class detectCycle142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode temp = head;
		temp.next = new ListNode(3);
		temp = temp.next;
		temp.next = new ListNode(5);
		temp = temp.next;
		ListNode cycle = temp;
		temp.next = new ListNode(7);
		temp = temp.next;
		temp.next = new ListNode(9);
		temp = temp.next;
		temp.next = cycle;
		//head = detectCycle(head);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	/*判圈算法证明
	 * https://blog.csdn.net/flying_all/article/details/79395983
	 */
	public static ListNode detectCycle(ListNode head) {
        
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		if(fast == null || fast.next == null) {
			return null;
		}else {
			slow = head;
			while(slow != fast) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
    }
	
	
	/*
	 * 使用空间解法
	 */
	public static ListNode detectCycle1(ListNode head) {
		
		HashMap<ListNode, Integer> map = new HashMap<>();
		if (head == null|| head.next == null) {
			return null;
		}
		while(head != null) {
			if (map.containsKey(head) == false) {
				map.put(head, 1);
				head = head.next;
			}else {
				return head;
			}
		}
		
		return null;
	}
	
	
}




