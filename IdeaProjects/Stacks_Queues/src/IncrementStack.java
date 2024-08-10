public class IncrementStack {
    //https://leetcode.com/problems/design-a-stack-with-increment-operation/
    class CustomStack {
        private int[] data;
        private int ptr;
        private int size;
        public CustomStack(int maxSize) {
            this.data=new int[maxSize];
            this.ptr=-1;
            this.size=maxSize;
        }

        public void push(int x) {
            if(isFull()){
                return;
            }else{
                ptr++;
                data[ptr]=x;
            }
        }

        public int pop() {
            if(ptr==-1){
                return -1;
            }
            else{
                int value=data[ptr];
                ptr--;
                return value;
            }
        }

        public void increment(int k, int val) {
            if(k<= data.length){
                for (int i = 0; i < k; i++) {
                    data[i]+=val;
                }
            }else{//elements are less than k
                for (int i = 0; i < data.length; i++) {
                    data[i]+=val;
                }
            }
        }
        private boolean isFull(){
            return ptr== data.length-1;
        }
    }
}
