import java.util.Scanner;
// area of circle
public class area_of_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter radius of circle = ");
        float r = input.nextFloat();
        if(r<=0){
            System.out.println("enter valid radius");
        }else{
            System.out.println("the area of circle is "+ r*r*3.14 );
        }
    }
}
