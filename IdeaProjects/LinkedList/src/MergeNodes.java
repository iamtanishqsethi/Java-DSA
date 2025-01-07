public class MergeNodes {
    //https://leetcode.com/problems/merge-nodes-in-between-zeros/
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead=new ListNode();
        ListNode node=dummyHead;
        ListNode current = head;
        if(head==null||head.next==null){
            return dummyHead;
        }
        while (current!=null){
            int sum=0;
            do{
                sum+=current.val;
                current=current.next;
            }
            while (current.val!=0);
            ListNode temp=new ListNode(sum);
            node.next=temp;
            node=node.next;
            current=current.next;
        }

        return dummyHead.next;
    }
}
