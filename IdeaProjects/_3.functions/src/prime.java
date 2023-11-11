import java.util.Scanner;
//to check if no entered is prime or not using functions

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer = ");
        int x = input.nextInt();
        if (isprime(x)){
            System.out.println("the integer entered is prime");
        }else{
            System.out.println("the integer entered is not prime");
        }
    }
    public static boolean isprime(int x){
        int i =2;
        if(x<=1){
            return false;
        }
        while(i*i<=x){
            if (x%i==0){
                return false;
            }
            i++;
        }
        if(i*i>x){
            return true;
        }
        return true;
    }
}
