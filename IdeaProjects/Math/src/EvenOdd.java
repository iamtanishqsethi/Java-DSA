import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer = ");
        int n = input.nextInt();
        System.out.println(Isodd(n));
    }
    public static boolean Isodd(int n){
        return (n&1)==1;
    }
}
