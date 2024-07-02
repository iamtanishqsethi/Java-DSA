public class mergeSortedLL {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        ListNode node= head;
        while(list1!=null&&list2!=null){
            if(list1.val>list2.val){
                node.next=list1;
                list1=list1.next;
                node=node.next;
            }else{
                node.next=list2;
                list2=list2.next;
                node=node.next;
            }

        }node.next=(list1.next!=null)?list1:list2;
        return head.next;
    }
}
