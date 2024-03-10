import java.rmi.StubNotFoundException;
class A {
    final int num = 10;//initialization is important
    String name;
    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}


public class Wrapper {
    public static void main(String[] args) {
        int a = 10;//primitive
        int  b = 20;
        Integer num = 45;//created as an object,much more functionality
        //swap(a,b);
        //System.out.println(a);
        //System.out.println(b);
        Integer num2 = 55;
//        swap2(num,num2);
//        System.out.println("num 1 ="+num);
//        System.out.println("num 2 ="+num2);

        final int bonus  = 2;
//        bonus= 3;  will give error , we cannot modify final variables
        // this immutability is only for primitives
        final A tanishq = new A("tanishq sethi");
        tanishq.name= "default";//can do this
        /*
        * when a num primitive is final , we cannot reassign it  */
//        tanishq = new A ("new object");  cant do this
//        tanishq.num=5;  cant do this , as it is 'final'
        A obj = new A("Rnadvsjhv");
        System.out.println(obj);
//
//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A("Random name");
//        }

    }

    // if we do this
    static void swap(int a, int b){
        int temp = a;
        a=b;
        b = temp;
        //but will be swapped within the function
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    //this will not swap the numbers as they are primitives
    // and in java there is no concept of pass by reference
    // only pass by value

    /*
    * but if we pass object reference value is passed
    *
    * Still won't swap  */
    static void swap2(Integer a, Integer b){
        Integer temp = a;
        a=b;
        b = temp;
//        System.out.println("a="+a);
//        System.out.println("b="+b);
    }
}
