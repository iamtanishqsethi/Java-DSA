public class Questions {
    //https://leetcode.com/problems/linked-list-cycle/
    //asked in amazon and microsoft
    public boolean hasCycle(ListNode head) {
        //using fast and slow pointer method
        ListNode fast =  head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    //finding length of cycle in LL
    public int cycleLength(ListNode head){
        ListNode fast= head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                int length =0;
                ListNode temp=slow;
                do {
                    temp=temp.next;
                    length++;
                }
                while(temp!=slow);
                return length;
            }
        }
        return 0;
    }
    //https://leetcode.com/problems/linked-list-cycle-ii/description/
    //find start the of cycle (using two pointer method)
    public ListNode detectCycle(ListNode head) {
        //we need length
        int length =0;
        ListNode fast =  head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=cycleLength(slow);
                break;
            }
        }
        if(length==0){
            //no cycle present
            return null;
        }
        //find the start
        ListNode first=head;
        ListNode second =head;
        while(length>0){
            second=second.next;
            length--;
        }
        //keep moving both the nodes forward, they will meet at cycle start
        while(first!=second){
            first=first.next;
            second=second.next;
        }
        return second;
    }
    //https://leetcode.com/problems/happy-number/
    //happy no #google question , also in Math for DSA assignment
    public boolean isHappy(int n) {
        //two pointer method
        int slow= n;
        int fast =n;
        do{
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        }while(fast!=slow);
        if(slow==1){
            return true;
        }
        return false;
    }
    private int findSquare(int number){
        int ans=0;
        while(number>0){
            int rem=number%10;
            ans+=rem*rem;
            number/=10;
        }
        return ans;
    }
    //https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
class ListNode {
      int val;
      ListNode next;

    ListNode() {
    }

    ListNode(int x) {
          val = x;
          next = null;
      }
}
