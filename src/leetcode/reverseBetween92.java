package leetcode;

import util.ListNode;

public class reverseBetween92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode temp = head;
		temp.next = new ListNode(3);
		temp = temp.next;
		temp.next = new ListNode(2);
		temp = temp.next;
		temp.next = new ListNode(4);
		temp = temp.next;
		temp.next = new ListNode(5);
		temp = temp.next;
		head = reverseBetween(head,2,5);
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	public static ListNode reverseBetween(ListNode head, int m, int n) {
        
		if (head.next == null || m == n) {
			return head;
		}
		ListNode pre = head, cur = head, nex;
		for(int i=1; i<m; i++) {
			pre = cur;
			cur = cur.next;
		}
		nex = cur.next;
		if(m == 1) {
			for(int i=1; i<n; i++) {
				ListNode temp = nex.next;
				cur.next = nex.next;
				nex.next = pre;
				pre = nex;
				nex = temp;
			}
			return pre;
		}
		for(int i=m; i<n; i++) {
			ListNode temp = pre.next;
			pre.next = nex;
			cur.next = nex.next;
			nex.next = temp;
			nex = cur.next;
		}
		
		return head;
    }
}

/*  此解答通过新建一个头结点的方式来处理m=1的情况，比较简单，链表的各种转换比较绕，需要重写此题
 * class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int i = 1;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (i < m) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        
        ListNode next = curr.next;
        // 1 - 2 - 3 - 4 - 5
        while (i < n) {
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
            next = curr.next;
            i++;   
        }
        return dummy.next;
    }
}
 */




