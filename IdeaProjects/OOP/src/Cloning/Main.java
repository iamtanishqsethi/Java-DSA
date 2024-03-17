package Cloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human tanishq = new Human(18,"tanishq sethi");
//        Human twin = new Human(tanishq); (takes lot of processing time)
        Human twin = (Human)tanishq.clone();
        System.out.println(twin.age+" "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;//tanishq.arr also changed for shallow copy
        System.out.println(Arrays.toString(tanishq.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
