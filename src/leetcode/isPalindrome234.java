package leetcode;

import java.util.List;

import util.ListNode;

public class isPalindrome234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode temp = head;
		temp.next = new ListNode(1);
		temp = temp.next;
		temp.next = new ListNode(2);
		temp = temp.next;
		temp.next = new ListNode(1);
		temp = temp.next;
		boolean result = isPalindrome(head);
		System.out.println(result);
	}
	public static boolean isPalindrome(ListNode head) {
        
		//head经过链表翻转后指向的是最后一个元素，其next已经为null，不太理解
		//采用快慢指针的方式查找单链表的中间节点，快指针一次走两步，慢指针一次走一步，当快指针走完时，慢指针刚好到达中间节点。
		if(head == null || head.next == null) {
			return true;
		}
		int len = 0, midLen = 0;
		ListNode pre=null, cur = head, temp;
		while(cur != null) {
			len++;
			cur = cur.next;
		}
		midLen = len/2;
		cur = head;
		while(midLen > 0) {
			cur = cur.next;
			midLen--;
		}
		while(cur != null) {
			temp = cur;
			cur = cur.next;
			temp.next = pre;
			pre = temp;
		}
		midLen = len/2;
		while(midLen > 0) {
			if(head.val != pre.val)
				return false;
			head = head.next;
			pre = pre.next;
			midLen--;
		}
		
		return  true;
    }
}
