import java.util.Scanner;
//to check if the entered integer is even or odd using functions
public class even_odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter integer = ");
        int x = in.nextInt();
        if(isEven(x)){
            System.out.println("the entered integer is even");
        }else{
            System.out.println("the entered integer is odd");
        }
    }
    public static boolean isEven(int x){
        if (x%2==0){
            return true;
        }
        return false;
    }
}
