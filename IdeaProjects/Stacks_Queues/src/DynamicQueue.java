public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){
            //double the size;similar to internal implementation of arraylist
            int[] temp = new int[data.length*2];
            //copy all previous elements in new one
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(front+i)% data.length];
                /*here we are not starting from 0 ,
                * we will start from the front and iterate by front + 1 , front +2 , etc
                */
            }
            front=0;
            end= data.length;
            data=temp;
        }
        return super.insert(item);
    }
}
