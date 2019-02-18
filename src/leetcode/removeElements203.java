package leetcode;

import util.ListNode;

public class removeElements203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
//		ListNode temp = head;
//		temp.next = new ListNode(1);
//		temp = temp.next;
//		temp.next = new ListNode(1);
//		temp = temp.next;
//		temp.next = new ListNode(1);
//		temp = temp.next;
		head = removeElements(head,1);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	public static ListNode removeElements(ListNode head, int val) {
		ListNode temp = head, pre = null;
		while(temp != null) {
			if(temp.val == val) {
				if (temp.next != null) {
					temp.val = temp.next.val;
					temp.next = temp.next.next;
					continue;
				}else {
					if(pre == null) {
						return null;
					}else {
						pre.next = null;
					}
					return head;
				}
			}
			pre = temp;
			temp = temp.next;
			
		}
		
		return head;
    }
}
