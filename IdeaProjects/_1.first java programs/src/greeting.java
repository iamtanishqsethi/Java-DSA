// input name and print greeting with name
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your name :");
        String a = input.nextLine();
        System.out.println("hello " + a + " how are you ?");

    }
}
