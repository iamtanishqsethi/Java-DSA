public class SumOfDigits {
    //to find the sum of digits of an integer
    public static void main(String[] args) {
        System.out.println(digitsum(1342));
    }
    static int digitsum(int n){
        if(n==0){
            return 0;
        }
        return(n%10+digitsum(n/10));
    }
}
