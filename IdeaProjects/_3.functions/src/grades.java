import java.util.Scanner;
//to display grades on the bases of marks entered

public class grades {
    public static void grades(int marks){
        if (marks >= 91 && marks <= 100){
            System.out.println("your grade is AA");
        } else if (((marks >= 81) && (marks <= 90))) {
            System.out.println("your grade is AB");
        } else if (((marks >= 71) && (marks <= 80))) {
            System.out.println("your grade is BB");
        } else if (((marks >= 61) && (marks <= 70))) {
            System.out.println("your grade is BC");
        }else if ((marks >= 51) && (marks <= 60)){
            System.out.println("your grade is CD");
        } else if (((marks >= 41) && (marks <= 50))) {
            System.out.println("your grade is DD");
        }else if (marks<=40){
            System.out.println("your grade is fail");
        }else {
            System.out.println("not a valid input");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks to check grade = ");
        int x = input.nextInt();
        grades(x);
    }
}
