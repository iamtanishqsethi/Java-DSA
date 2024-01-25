public class Factorial1toN {
    //printing the product of numbers from 1 to n (factorial of a number)
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        if(n==1){//base condition , 1! = 1
            return 1;
        }
        return n*factorial(n-1);
    }
}
