public class ThirdLast {
    public int last(ListNode head){
        int size=0;
        ListNode node=head;
        while(node!=null){
            size++;
            node=node.next;
        }
        if(size<3){
            return -1;
        }
        ListNode temp=head;
        for (int i = 1; i <=size-3 ; i++) {
            temp=temp.next;
        }
        return temp.val;
    }
}
