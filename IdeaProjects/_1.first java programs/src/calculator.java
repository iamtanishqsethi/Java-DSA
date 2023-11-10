//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number = ");
        int num1 = input.nextInt();
        System.out.print("enter second number = ");
        int num2 = input.nextInt();

        System.out.print("enter operator to proceed(+,-,*,/) = ");
        String op = input.next();
        if (op == "+"){
            int sum = num1 + num2;
            System.out.println("the sum of numbers is = "+ sum);

        }
        else if (op == "-") {
            int diff = num1 - num2;
            System.out.println("the difference of numbers is = "+ diff);

        }
        else if (op == "*") {
            int prod = num1 * num2;
            System.out.println("the product of numbers is = " + prod);
        }
        else if (op == "/") {
            int div = num1 / num2;
            System.out.println("the div of numbers is = " + div);
        }


    }
}
