import java.util.Stack;
//optimize code
//https://leetcode.com/problems/add-two-numbers-ii/description/
public class AddTwoNumbers2 {
    //hint taken - store  in stack
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1= new Stack<>();
        Stack<Integer> stack2= new Stack<>();
        Stack<Integer> stack3=new Stack<>();
        while(l1!=null){
            stack1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            stack2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode dummyHead=new ListNode(0);
        ListNode current=dummyHead;
        while(!stack1.isEmpty()||!stack2.isEmpty()){
            int value1=(!stack1.isEmpty())?stack1.pop():0;
            int value2=(!stack2.isEmpty())?stack2.pop():0;
            int sum=value1+value2+carry;
            carry=sum/10;
            stack3.push(sum%10);
        }
        if(carry>0){
            stack3.push(carry);
        }
        while (!stack3.isEmpty()){
            current.next=new ListNode(stack3.pop());
            current=current.next;
        }
        return dummyHead.next;
    }
}
