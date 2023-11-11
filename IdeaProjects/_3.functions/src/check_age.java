import java.util.Scanner;
//to check if the person is eligible to vote or not
public class check_age {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your age = ");
        int x =in.nextInt();
        if (isEligible(x)){
            System.out.println("yes, you are eligible to vote");
        }
        else{
            System.out.println("no you are not eligible to vote ");
        }
    }
    public static boolean isEligible(int x){
        if (x>=18){
            return true;
        }
        else {
            return false;
        }
    }
}
