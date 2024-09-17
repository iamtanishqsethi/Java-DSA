public class SwapInPair {
    //https://leetcode.com/problems/swap-nodes-in-pairs/
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode current=dummyHead;
        while(current.next!=null&&current.next.next!=null){
            ListNode first=current.next;
            ListNode secocnd=current.next.next;
            first.next=secocnd.next;
            current.next=secocnd;
            secocnd.next=first;
            current=first;
        }
        return dummyHead.next;
    }
}
