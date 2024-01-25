public class Nto1 {
    //to print numbers  from n to 1
    public static void main(String[] args) {
        prin(5);
    }
    static void prin(int n){
        if(n<=0){
            return;
        }
        System.out.println(n);
        prin(n-1);
    }
}
