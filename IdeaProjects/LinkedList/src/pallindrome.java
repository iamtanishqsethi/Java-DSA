public class pallindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        ListNode reverseHead=reverse(mid);
        while(reverseHead!=null){
            if(reverseHead.val!=head.val){
                return false;
            }
            head=head.next;
            reverseHead=reverseHead.next;
        }return true;
    }
    private ListNode middle(ListNode head){
        ListNode slow =head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode reverse(ListNode head){
        if(head==null&&head.next==null){
            return head;
        }
        ListNode previous=null;
        ListNode current=head;
        ListNode Next=current.next;
        while(current!=null){
            current.next=previous;
            previous=current;
            current=Next;
            if(Next!=null) {
                Next = Next.next;
            }
        }
        return previous;
    }
}
