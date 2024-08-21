import java.util.ArrayList;
import java.util.List;

public class CopyRandom {//
    //https://leetcode.com/problems/copy-list-with-random-pointer/
    public Node copyRandomList(Node head) {

        if(head==null){
            return null;
        }
        Node newHead=new Node(head.val);
        Node copy=newHead;
        Node original= head.next;
        List<Node> originalNodes=new ArrayList<>();
        List<Node> copyNodes=new ArrayList<>();
        originalNodes.add(head);
        copyNodes.add(newHead);
        while (original!=null){
            Node temp=new Node(original.val);
            copy.next=temp;
            originalNodes.add(original);
            copyNodes.add(temp);
            copy=copy.next;
            original=original.next;
        }
        copy=newHead;
        for (int i = 0; i < originalNodes.size(); i++) {
            if(originalNodes.get(i).random!=null){
                int randomIndex=originalNodes.indexOf(originalNodes.get(i).random);
                copyNodes.get(i).random=copyNodes.get(randomIndex);
            }
        }
        return newHead;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
