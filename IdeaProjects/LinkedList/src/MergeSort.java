public class MergeSort {
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){//linked list empty or has only one element
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }
    ListNode merge(ListNode list1,ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode tail=dummyHead;
        while(list1!=null && list2!=null){
            if(list1.val< list2.val){
                tail.next=list1;
                list1=list1.next;
                tail=tail.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
                tail=tail.next;
            }
        }
        //different approach to fill the linked list if one of the linked list is empty
        tail.next=(list1!=null)?list1:list2;
        return dummyHead.next;//returning the actual head
    }
    //the getMid function here is different from the previous method , this method also breaks the linked list at the mid
    ListNode getMid(ListNode head){
        ListNode midPrev=null;
        while(head!=null && head.next!=null){
            midPrev=(midPrev==null)?head:midPrev.next;//different approach to get the midprev node
            head=head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next=null;//breaking the linked list at mid
        return mid;
    }
}
