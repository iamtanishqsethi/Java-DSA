//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a string = ");
        String str = input.next();
        int j = str.length()  ;
        String revstr = "";
        for (j=j-1;j>=0;j--){
            revstr += str.charAt(j);
        }
        if(revstr.equals(str)){
            System.out.println("the entered string is a pallindrome");
        }else{
            System.out.println("the entered string is not a pallindrome");
        }
    }
}
