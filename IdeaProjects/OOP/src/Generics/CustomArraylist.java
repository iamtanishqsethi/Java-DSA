package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;//size basically means the no. of elements in the array , not  the actual length of the array
    public CustomArraylist(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp= new int[data.length*2];
        //copying the original items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
        int removed = data[--size];
        //it will return the last index value and next time something is added it will override on it
        //rather tha removing it
        return removed;
    }
    public int get (int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    private boolean isFull() {
        return size==data.length;
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.set(1,456);
//        list.size();
//        list.isEmpty();
        CustomArraylist list = new CustomArraylist();
//        list.add(3);
//        list.add(9);
//        list.add(6);
        for (int i = 0; i < 13; i++) {
            list.add(2*i);
        }
        System.out.println(list);
        /*
        * there is a problem with our custom array list , it only takes input as int
        * but an actual array list can take any type of input
        * even custom data type */
    }
}
