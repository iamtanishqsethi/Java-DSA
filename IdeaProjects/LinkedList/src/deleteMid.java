public class deleteMid {
    //https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
    public ListNode deleteMiddle(ListNode head) {
        if(head==null ||head.next==null){
            return null;
            //edge case for only one element or an empty linked list
        }
        //slow and fast pointer method to find mid , optimised solution than before
        //used help to optimise it
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        if(prev!=null){
            prev.next=slow.next;
        }
        return head;
    }

}
