//Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class greater_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number =");
        int num1 = input.nextInt();
        System.out.print("enter second number =");
        int num2 = input.nextInt();
        if (num1>num2){
            System.out.println(num1 + " is greater than "+ num2);
        }
        else {
            System.out.println(num2 + " is greater than "+ num1);

        }
    }
}
