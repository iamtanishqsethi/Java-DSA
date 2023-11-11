import java.util.Scanner;
//to check if the number entered is a palindrome

public class pallindrome_no {
    public static boolean palinnum(int x ){
        int y = 0;
        int temp = x;
        while(temp!=0){
            y=y*10 + temp%10;
            temp=temp/10;
        }
        if (x==y){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer = ");
        int i = in.nextInt();
        if (palinnum(i)){
            System.out.println("the integer entered is a palindrome number ");
        }else{
            System.out.println("the integer entered is not a palindrome number ");
        }
    }
}
