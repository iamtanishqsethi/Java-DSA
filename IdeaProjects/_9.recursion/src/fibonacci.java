public class fibonacci {
    //fibonacci series
    public static void main(String[] args) {
        fibonacci(0,1,1);
    }
    public static void fibonacci(int first,int second,int n){
        if (n>5){
            return;
        }
        System.out.println(first);
        int temp = first;
        first=second;
        second=temp+second;
        fibonacci(first,second,n+1);
    }
}
