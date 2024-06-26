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
    //Insert using recursion
    public void insertRec(int value,int index){
        head=insertRec(value,index,head);
    }
    private Node insertRec(int value ,int index , Node node){
        if(index==0){
            Node temp = new Node(value,node);
            size++;
            return temp;
        }
        node.next=insertRec(value,index--,node.next);
        return node;
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
    //merge linked list
    public static LL merge(LL first , LL second){
        Node f=first.head;
        Node s=second.head;
        LL ans= new LL();
        while(f!=null && s!=null){
            if(f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }
            else{
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }
    //sorting linked list (bubble sort)
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row,int col){
        if (row==0){
            return;
        }
        if(col<row){
            Node first = get(col);
            Node second = get(col+1);
            if(first.value>second.value){
                //swap
                if(first==head){//case 1
                    head=second;
                    first.next=second.next;
                    second.next=first;
                } else if (second==tail) {//case 2
                    Node prev = get(col-1);
                    prev.next=second;
                    tail=first;
                    first.next=null;
                    second.next=first;
                }
                else{//case 3
                    Node prev = get(col-1);
                    prev.next=second;
                    first.next=second.next;
                    second.next=first;
                }
            }bubbleSort(row,col+1);
        }else bubbleSort(row-1,0);
    }
    //reversing linked list using recursion
    private void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        //reversing when moving out of the recursion calls
        tail.next=node;
        tail=node;
        tail.next=null;
        //takes extra space
    }
    //in place reversal of linked list
    //https://leetcode.com/problems/reverse-linked-list/description/
    //the leet code question is almost similar
    public void reverse(){
        if(size<2){
            return;
        }
        Node prev= null;
        Node pres = head;
        Node Next = pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=Next;
            if(Next!=null){
                Next=Next.next;
            }
        }
        head= prev;
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
