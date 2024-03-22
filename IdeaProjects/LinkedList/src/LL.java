public class LL {//custom linked list
    private Node head;//the starting node or node of index 0
    private Node tail;//the last node or the node  of index size-1
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail==null){//if list is initially empty
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int value){
        if(tail==null){//if list is initially empty
            insertFirst(value);
        }
        else{
            Node node = new Node(value);
            tail.next=node;//making the previous tail to link with the new node
            tail = node;//updating tail
            size++;
        }
    }
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size-1){
            insertLast(value);
            return;
        }
        Node temp = head;
        //traversing till the index
        for (int i = 1; i < index; i++) {//starting from one because we need the next of temp
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next =node;//breaking the previous link
        size++;
    }
    public void display(){
        Node temp = head;//using temp node to traverse
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public int deleteFirst(){
        //just making the head point to the next node , the previous head will be collected by garbage collector
        int value = head.value;
        head = head.next;
        //if after removing the list is empty , make the tail null too
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=  get(size-2);
        int value = tail.value;
        tail=secondLast;//updating the tail to the second last node
        tail.next = null;//breaking the link by marking the next ton null
        return value;
    }
    public int delete(int index){
        if(index ==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next=prev.next.next;//breaking the previous link(skipping the node to be deleted)
        return value;

    }
    public Node findNode(int value){//similar to get()
        Node node = head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){//to get the specific node at an index
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
        //O(n) complexity
    }

    private class Node {
        private int value;
        private Node next;// a reference variable of type node pointing to the next node in the heap
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
