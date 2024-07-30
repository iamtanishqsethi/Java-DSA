public class MinStack {//
    //https://leetcode.com/problems/min-stack/
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    protected int[] data;
    protected int[] minData;
    private static final int DEFAULT_SIZE=10;
    private int ptr;

    public MinStack() {
        this(DEFAULT_SIZE);
    }

    public MinStack(int size) {
        this.data=new int[size];
        this.minData=new int[size];
        this.ptr=-1;
    }

    public void push(int val) {
        if(isFull()){
            resize();
        }
        ptr++;
        data[ptr]=val;
        if(ptr==0){//first element
            minData[ptr]=val;
        }else{
            //keeping a record for min value
            minData[ptr]=Math.min(minData[ptr-1],val);
        }



    }
    private void resize(){
        int[] tempData=new int[data.length*2];
        int[] tempMin=new int[minData.length*2];
        System.arraycopy(data,0,tempData,0,data.length);
        System.arraycopy(minData,0,tempMin,0,minData.length);
        data=tempData;
        minData=tempMin;
    }

    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("Cannot pop from an empty stack");
        }
        ptr--;

    }

    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Cannot pop from an empty stack");
        }
        return data[ptr];
    }

    public int getMin() {
        if(isEmpty()){
            throw new RuntimeException("Cannot pop from an empty stack");
        }
        return minData[ptr];//the min value upto that point
    }
    private boolean isFull(){
        return ptr==data.length-1;
    }
    private boolean isEmpty(){
        return ptr==-1;
    }
}
