public class ProductOfDigits {
    //to find the products of digits of an integer
    public static void main(String[] args) {
        System.out.println(digitprod(1342));
    }
    static int digitprod(int n){
        if(n%10==0){//slight change
            return n;
        }
        return(n%10*digitprod(n/10));
    }
}
