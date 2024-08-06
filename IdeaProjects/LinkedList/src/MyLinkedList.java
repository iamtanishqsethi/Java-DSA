
public class MyLinkedList {
    private Node head;
    private Node tail;
    private int size;


    public MyLinkedList() {
        this.size=0;
    }

    public int get(int index) {
        if(index < 0 || index >= size){
            return -1;
        }
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val) {

        Node node=new Node(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=node;
        }
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) {
            return;
        }
        if(index == 0) {
            addAtHead(val);
        } else if(index == size) {
            addAtTail(val);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
    }
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        if(index == 0) {
            head = head.next;
            if(head == null) {
                tail = null;
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null) {
                tail = temp;
            }
        }
        size--;
    }
    private class Node{
        private int val;
        private Node next;
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
}
