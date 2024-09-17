public class InsertionSortList {//
    //https://leetcode.com/problems/insertion-sort-list/
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){
            //single or no elements
            return head;
        }
        ListNode dummyHead=new ListNode();//new list
        ListNode current=head;
        ListNode prevNode=dummyHead;//prev node for the new list
        ListNode next=null;
        while(current!=null){
            next=current.next;
            while(prevNode.next!=null && prevNode.next.val<current.val){
                //if the new list is not empty and the value of the node is less than the current node value in og list
                //traverse forward in new list
                prevNode=prevNode.next;
            }
            //else
            //adding the current node to new list
            current.next=prevNode.next;
            prevNode.next=current;
            prevNode=dummyHead;//resetting the prevNode back
            current=next;
        }
        //returning the new list;
        return dummyHead.next;
    }
    /*
    *
In this solution I have created a new linked list
- and set a prev pointer at the starting i.e. before the actual head that will be returned
- this new list will contain the sorted part of the original list
- as we move forward in the og list
- we keep on inserting the elements in their respective pos in new list
- traverse in the new list if it is not empty or the next element to the prev pointer is less than the current element in og list
- else
- insert that element in the new list at its respective position
- reset the prev pointer to previous of new head
- move the current pinter ahead*/
}
