public class RemoveEle {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode node= head;
        ListNode previous=null;
        while(node!=null){
            if(node.val==val){
                previous.next=node.next;
                
            }


        }
    }
}
