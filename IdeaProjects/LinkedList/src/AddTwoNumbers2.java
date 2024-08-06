import java.util.Stack;
//wrong code
//TODO:fix code 
public class AddTwoNumbers2 {
    //hint taken - store  in stack
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack= new Stack<>();
        int carry=0;
        while(l1!=null||l2!=null){
            int value1=(l1!=null)?l1.val:0;
            int value2=(l2!=null)?l2.val:0;
            int sum=value1+value2+carry;
            carry=sum/10;
            stack.push(sum%10);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(carry>0){
            stack.push(carry);
        }
        ListNode dummyHead=new ListNode(0);
        ListNode current=dummyHead;
        while(!stack.isEmpty()){
            current.next=new ListNode(stack.pop());
            current=current.next;
        }
        return dummyHead.next;
    }
}
