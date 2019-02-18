package leetcode;

import util.ListNode;

public class rotateRight61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode rotateRight(ListNode head, int k) {
        
		if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head, now = head;
		int len = 1;
		while(now.next != null) {
			now = now.next;
			len++;
		}
		
		k = k%len;
		if(k == 0) return head;
		for(int i=1; i<len-k; i++) {
			pre = pre.next;
		}
		now.next = head;
		head = pre.next;
		pre.next = null;
//		for(; k > 0; k--) {
//			pre.next = null;
//			now.next = head;
//			head = now;
//			now = pre;
//			pre = head;
//			while(pre.next != now) {
//				pre = pre.next;
//			}
//		}
		
		return head;
    }
}
