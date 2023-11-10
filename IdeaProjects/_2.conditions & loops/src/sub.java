//subtract the product and the sum of the integer
import java.util.Scanner;
public class sub {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer = ");
        int x = input.nextInt();
        int sum = 0;
        int prod = 1;
        if(x==0){
            System.out.println("the integer should be non zero");
        }else{
            while(x>0){
                int digit= x%10;
                sum+=digit;
                prod*=digit;
                x/=10;
            }
        }
        System.out.println("the result of the program is");
        System.out.print(prod-sum);
    }
}
