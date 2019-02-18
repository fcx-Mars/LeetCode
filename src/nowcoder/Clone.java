package nowcoder;

import util.RandomListNode;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public RandomListNode Clone(RandomListNode pHead){
        
		if(pHead == null ) return pHead;
		RandomListNode curNode = pHead;
		while(curNode != null) {
			RandomListNode cloneNode = new RandomListNode(curNode.label);
			RandomListNode nextNode = curNode.next;
			curNode.next = cloneNode;
			cloneNode.next = nextNode;
			curNode = nextNode;
		}
		curNode = pHead;
		while(curNode != null) {
			curNode.next.random = curNode.random == null ? null : curNode.random.next;
			curNode = curNode.next.next;
		}
		curNode = pHead;
		RandomListNode pCloneHead = pHead.next;
		while(curNode != null) {
			RandomListNode cloneNode = curNode.next;
			curNode.next = cloneNode.next;
			cloneNode.next = cloneNode.next == null ? null : curNode.next.next;
			curNode = curNode.next;
		}
		return pCloneHead;
    }
}
