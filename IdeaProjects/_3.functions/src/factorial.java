import java.util.Scanner;
//to find the factorial of an integer
public class factorial {
    public static int factorial(int x ){
        if(x==0 || x==1){
            return 1;
        }else{
            int fact =  1;
            for(int n = x ;n>=1;n--){
                fact=fact*n;
            }
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer = ");
        int x = input.nextInt();
        System.out.println("the factorial of the number is "+factorial(x));
    }
}
