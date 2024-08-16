public class FlattenDLL {
    //https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node node=head;
        while(node!=null){
            if(node.child!=null){
                Node current=node;
                Node temp=current.child;
                //find last of child
                Node last=temp;
                while(last.next!=null){
                    last=last.next;
                }
                if(current.next!=null){
                    last.next=current.next;
                    current.next.prev=last;
                }

                current.next=temp;
                temp.prev=current;
                current.child=null;
            }
            node=node.next;
        }
        return head;
    }
    private class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
}

