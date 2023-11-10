//To calculate Fibonacci Series up to n numbers.
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number of terms = ");
        int n = input.nextInt();
        int first_term = 0;
        int second_term = 1;
        for (int count = 1; count <= n; ++count){
            System.out.print(first_term+" ,");

            int next_term = first_term + second_term;
            first_term=second_term;
            second_term=next_term;

        }
    }
}
