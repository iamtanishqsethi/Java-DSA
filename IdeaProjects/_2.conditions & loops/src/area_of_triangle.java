import java.util.Scanner;
// area of triangle
public class area_of_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter height of triangle = ");
        float h = input.nextFloat();
        System.out.print("enter base of triangle = ");
        float b = input.nextFloat();
        if(h<=0 || b<=0){
            System.out.println("enter valid dimensions");
        }
        else {
            System.out.println("the area of triangle is " + 0.5 * h * b);
        }
    }
}
