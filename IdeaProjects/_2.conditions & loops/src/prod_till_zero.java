import java.util.Scanner;
//product of numbers till user enters 0
public class prod_till_zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int prod = 1;
        while (true){
            System.out.print("enter integer to take product or enter zero to exit and print answer = ");
            int i = input.nextInt();
            if(i==0){
                break;
            }else{
                prod*=i;
            }
        }
        System.out.println("the final product is = "+prod);
    }
}
