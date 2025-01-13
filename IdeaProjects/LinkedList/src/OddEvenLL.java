public class OddEvenLL {
    //similar to slow and fast pointer
    //but both the pointers behave as fast
    //odd starts from first and even starts from 2nd node
    //even head is always ahead of odd node so in this case even will reach at end first
    //https://leetcode.com/problems/odd-even-linked-list/
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode oddHead=head;
        ListNode evenHead=head.next;
        ListNode oddNode=oddHead;
        ListNode evenNode=evenHead;

        while(evenNode!=null && evenNode.next!=null){

            oddNode.next=oddNode.next.next;
            evenNode.next=evenNode.next.next;
            oddNode=oddNode.next;
            evenNode=evenNode.next;
        }
        //join both linked list
        oddNode.next=evenHead;

        return oddHead;
    }
}
