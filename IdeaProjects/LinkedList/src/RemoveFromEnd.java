public class RemoveFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead=new ListNode(0);
        //using dummyHead to handle edge case where head has to be removed
        dummyHead.next=head;
        //get size
        int size=0;
        ListNode sizeNode=head;
        while(sizeNode!=null){
            size++;
            sizeNode=sizeNode.next;
        }
        //traverse till size-n
        ListNode node=dummyHead;
        for(int i=1;i<=size-n;i++){
            node=node.next;
        }
        //remove node
        if(node.next!=null){
            node.next=node.next.next;
        }

        return dummyHead.next;
    }
}
