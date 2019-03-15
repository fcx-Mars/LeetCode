package nowcoder;

import util.ListNode;

public class FindFirstCommonNode37 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        ListNode pNode1 = pHead1;
        ListNode pNode2 = pHead2;
        while(pNode1 != pNode2){
            pNode1 = (pNode1 == null) ? pHead2 : pNode1.next;
            pNode2 = (pNode2 == null) ? pHead1 : pNode2.next;
        }
        return pNode1;



        //渣渣代码
        /*if(pHead1 == null || pHead2 == null) return null;
        ListNode pNode1 = pHead1;
        ListNode pNode2 = pHead2;
        int len1 = 0;
        int len2 = 0;
        while (pNode1.next != null) {
            pNode1 = pNode1.next;
            len1++;
        }
        while (pNode2.next != null){
            pNode2 = pNode2.next;
            len2++;
        }
        int len = len1-len2;
        if (len >= 0){
            pNode1 = pHead1;
            pNode2 = pHead2;
        }else if(len < 0){
            pNode1 = pHead2;
            pNode2 = pHead1;
        }
        while(len >0){
            pNode1 = pNode1.next;
            len--;
        }
        while(pNode1 != pNode2 && pNode1!=null && pNode2!=null){
            pNode1 = pNode1.next;
            pNode2 = pNode2.next;
        }


        return pNode1;*/
    }
}
