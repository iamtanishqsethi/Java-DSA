import java.util.Scanner;
//sum of numbers till user enters 0
public class sum_till_zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("enter integer to sum or enter zero to exit and print answer = ");
            int i = input.nextInt();
            if(i==0){
                break;
            }else{
                sum+=i;
            }
        }
        System.out.println("the final sum is = "+sum);
    }
}
