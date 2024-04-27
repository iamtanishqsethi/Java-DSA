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
    // https://leetcode.com/problems/reverse-linked-list/submissions/
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }
    //https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        //skipping the first left -1 nodes
        ListNode current = head;
        ListNode previous = null;
        for(int i=0;current!=null && i< left-1;i++){
            previous=current;
            current=current.next;
        }
        ListNode last = previous;
        ListNode newEnd=current;
        //reversing between left and right
        ListNode next = current.next;
        for (int i = 0; current!=null && i < right-left+1; i++) {
            current.next=previous;
            previous=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=previous;
        }else{
            head=previous;
        }
        newEnd.next=current;
        return head;
    }
    // https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        //reversing second half
        ListNode headSecond = reverseList(mid);
        ListNode reReverseHead = headSecond;
        //comparing both halves
        while(head!=null&&headSecond!=null){
            if(head.val!= headSecond.val){
                break;//not palindrome
            }
            head=head.next;
            headSecond=headSecond.next;
        }

        //in the end re reverse the reversed part
        reverseList(reReverseHead);
        if(head==null || headSecond==null){
            return true;
        }return false;
    }
    //https://leetcode.com/problems/reorder-list/
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode headFirst = head;
        ListNode headSecond = reverseList(mid);
        //rearranging
        while(headFirst!=null && headSecond!=null){
            //for first half
            ListNode temp=headFirst.next;
            headFirst.next=headSecond;
            headFirst=temp;
            //for second half
            temp=headSecond.next;
            headSecond.next=headFirst;
            headSecond=temp;
        }
        //setting next of tail to null
        if(headFirst!=null){
            headFirst.next=null;
        }
    }
    //https://leetcode.com/problems/reverse-nodes-in-k-group/
    public ListNode reverseKGroup(ListNode head, int k){
        if(k<=1||head==null){
            return head;
        }
        ListNode current=head;
        ListNode prev=null;

        int length=getLength(head);
        int count=length/k;//no of groups we have to reverse
        while(count>0){
            ListNode last=prev;
            ListNode newEnd=current;
            ListNode next=current.next;
            //reversing
            for (int i=0;current!=null && i<k;i++) {
                current.next=prev;
                prev=current;
                current=next;
                if(next!=null){
                    next=next.next;
                }
            }
            if(last!=null){
                last.next=prev;
            }else{
                head=prev;
            }
            newEnd.next=current;
            prev=newEnd;
            count--;
        }
        return head;
    }
    //to get the length of the total linked list
    public int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
    //https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    //similar question


    //rotate list
    //https://leetcode.com/problems/rotate-list/
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k<=0){
            return head;
        }
        //need to find the last node
        int length=1;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
            length++;
        }
        last.next=head;
        int rotation=k%length;
        int skip = length-rotation;//the subgroup
        ListNode newLast=head;
        for(int i=0;i<skip-1;i++){
            newLast=newLast.next;
        }
        head=newLast.next;
        newLast.next=null;
        return head;
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
