public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front=0;
    protected int end =0;
    private int size=0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {

        this.data=new int[size];
    }
    public boolean isFull(){
        return size==data.length-1;
    }
    public boolean isEmpty(){
        return size==-1;
    }
    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++]=item;
        end=end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{//O(n)
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed = data[front++];
        front=front%data.length;
        size++;
        return removed;
    }
    public int front()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    public void display(){
        //if we use the same approach used in simple queue
        //it might result in error , if front and end are pointing to the same element
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        int i=front;
        do {
            System.out.print(data[i]+"->");
            i++;
            i=i% data.length;//if 'i' becomes more than the length
        }while(i!=end);
        System.out.println("END");
    }
}
