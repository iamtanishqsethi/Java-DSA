public class RemoveEle {//TODO: reattempt it later
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead=new ListNode(0);
        dummyHead.next=head;
        ListNode node= dummyHead;
        while(node.next!=null){
            if(node.next.val==val){
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
        }
        return dummyHead.next;
    }
}
