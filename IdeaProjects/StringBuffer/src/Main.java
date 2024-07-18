import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        //constructor type 1
        StringBuffer buffer = new StringBuffer();//initial capacity 16
        //append method
        buffer.append("hello world");


        //constructor type 2
        //we can pass a string directly
        StringBuffer buffer2 = new StringBuffer("tanishq");

        //constructor type 3
        //we can define the capacity initially
        StringBuffer buffer3 = new StringBuffer(30);

        //insert at particular index
        buffer.insert(2, "tan");

        //replace from beginning to end index
        buffer.replace(1,5,"hello");
        //also  delete method that deletes from a specified index
        //.capacity() gives the capacity of the  buffer
        String str = buffer.toString();
        System.out.println(str);

        //rounding off
        DecimalFormat df=new DecimalFormat("0.000");
        System.out.println(df.format(7.2));
    }
}