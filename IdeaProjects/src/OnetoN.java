public class OnetoN {
    //print from 1 to n
    public static void main(String[] args) {
        print(5);
    }
    static void print(int n){
        if(n<=0){
            return;
        }
        print(n-1);//once it coves out of the stack then we have to print
        System.out.println(n);
    }
}
