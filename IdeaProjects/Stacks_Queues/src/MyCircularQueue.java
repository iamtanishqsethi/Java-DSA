public class MyCircularQueue {
    //https://leetcode.com/problems/design-circular-queue/
    private int[] data;
    private int front=0;
    private int rear=0;
    private int size=0;
    public MyCircularQueue(int k) {
        this.data=new int[k];
    }

    public boolean enQueue(int value) {
        if(isFull()) return false;
        data[rear++]=value;
        rear=rear% data.length;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        int removed=data[front++];
        front=front% data.length;
        size--;
        return true;
    }

    public int Front() {
        if(isEmpty()) return -1;
        return data[front];
    }

    public int Rear() {
        if(isEmpty()) return -1;
        return data[(rear-1 + data.length)% data.length];//fixed for wrapping if rear values
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==data.length;
    }
}
