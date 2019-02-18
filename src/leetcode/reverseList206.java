package leetcode;

import util.ListNode;

public class reverseList206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
			return head;
		}
		ListNode pre = head, node = head.next, next = node.next;
		head.next = null;
		while(node != null) {
			node.next = pre;
			pre = node;
			node = next;
			if(next != null)
				next = next.next;
		}
		
		return pre;
    }
}


/*  思路相同，实现更加简单，边界条件控制的更好
 * class Solution {
    public ListNode reverseList(ListNode head){
        
        ListNode prev =null;
        ListNode curr = head;
        while(curr !=null){
            ListNode temp = curr;
            curr = curr.next;
            temp.next = prev;            
            prev = temp;
        }
        return prev;
    }
   
}
 */


