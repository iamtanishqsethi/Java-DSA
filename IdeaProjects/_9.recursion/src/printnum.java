//print numbers 1-5 using recursion
public class printnum {
    public static void main(String[] args) {
       print(1);
    }
    public static void print(int n){
        if (n>5){//base condition
            return;//returns back to where it was called i.e. back to line 4
        }
        System.out.println(n);
        //recursive call, can be treated as separate call in stack memory
        print(n+1);
    }
}