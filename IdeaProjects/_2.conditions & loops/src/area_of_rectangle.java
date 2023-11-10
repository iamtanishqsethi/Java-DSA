import java.util.Scanner;
// area of rectangle
public class area_of_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter length of rectangle = ");
        float l = input.nextFloat();
        System.out.print("enter base of triangle = ");
        float b = input.nextFloat();
        if(l<=0 || b<=0){
            System.out.println("enter valid dimensions");
        }
        else {
            System.out.println("the area of rectangle is " +  l * b);
        }
    }
}
