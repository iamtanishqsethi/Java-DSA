//Input currency in rupees and output in USD.
import java.util.Scanner;

public class currency_conv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter amount  in INR = ");
        int inr = input.nextInt();
        float usd = (inr * 83.24f);
        System.out.println("the entered amount in usd is = " + usd);

    }
}
