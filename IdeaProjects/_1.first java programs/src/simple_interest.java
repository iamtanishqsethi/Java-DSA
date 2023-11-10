// simple interest by taking p,t,r as input
import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter principle amount = ");
        float principle = input.nextFloat();
        System.out.print("enter time  = ");
        int time = input.nextInt();
        System.out.print("enter rate of interest = ");
        float rate = input.nextFloat();

        float si = principle + (rate * time);
        System.out.println("the simple interest is = "+ si);




    }
}
