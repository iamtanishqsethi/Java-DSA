public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;//here the internal array is not dynamic
    int ptr =-1;//pointer for referencing the last index of our stack
    public CustomStack(){//when nothing is passed we use default size
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data=new int[size];
    }
    public boolean push(int item){
        //if array is already full?
        if(isFull()){
            System.out.println("STACK IS FULL");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws CustomException{
        if(isEmpty()){
            throw new CustomException("Cannot Pop from empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public int peek()throws CustomException{

        //what if stack is empty?
        if(isEmpty()){
            throw new CustomException("Cannot peek from empty stack");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr==data.length-1;//if ptr is at last index
    }
    private boolean isEmpty(){
        return ptr==-1;//if ptr is at index -1
    }
}
