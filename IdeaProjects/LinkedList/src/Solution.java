class Solution {
//gets a random node from the list
//https://leetcode.com/problems/linked-list-random-node/
    private ListNode headPtr;
    private int size;
    public Solution(ListNode head) {
        this.headPtr=head;
        getSize(headPtr);
    }
    private void getSize(ListNode headPtr){
        int size=0;
        ListNode node=headPtr;
        while(node!=null){
            size++;
            node=node.next;
        }
        this.size=size;
    }

    public int getRandom() {
        int size=this.size;
        int randomIndex=(int)(Math.random()*size);
        ListNode node=this.headPtr;
        while(randomIndex!=0){
            node=node.next;
            --randomIndex;
        }
        return node.val;
    }

}
