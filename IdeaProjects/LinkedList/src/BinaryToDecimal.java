import java.util.ArrayList;
//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
public class BinaryToDecimal {
    public static void main(String[] args) {

    }
    public int getDecimalValue(ListNode head) {
        ListNode mover = head;

        int size =0;
        while(mover!=null){
            size++;
            mover=mover.next;
        }
        ListNode temp=head;
        int ans=0;
        for(int i=size-1;i>=0;i--){
            ans+=(temp.val)*(int)(Math.pow(2,i));
            temp=temp.next;
        }
        return ans;
    }
}
