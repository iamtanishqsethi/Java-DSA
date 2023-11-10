// to check if the number entered is even or odd
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number = ");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("the entered number is even");
        }
        else {
            System.out.println("the entered number is odd");
        }
    }
}
