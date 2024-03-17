package Generics;

import java.util.Arrays;
//here t should either be Number or its subclasses

public class Wildcard<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0;//size basically means the no. of elements in the array , not  the actual length of the array
    public Wildcard(){

        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp= new Object[data.length*2];
        //copying the original items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public T remove(){
        T removed = (T)data[--size];
        //it will return the last index value and next time something is added it will override on it
        //rather tha removing it
        return removed;
    }
    public T get (int index){

        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){

        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomGenericArraylist{" +
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
        Wildcard list = new Wildcard();
//        list.add(3);
//        list.add(9);
//        list.add(6);
//        for (int i = 0; i < 13; i++) {
//            list.add(2*i);
//        }
//        System.out.println(list);
        /*
        * there is a problem with our custom array list , it only takes input as int
        * but an actual array list can take any type of input
        * even custom data type */

        Wildcard<Integer> list3 = new Wildcard<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2*i);
        }
        System.out.println(list3);
    }
}
