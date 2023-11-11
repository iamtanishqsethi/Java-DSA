import java.util.Scanner;
//to find the max and min value among three integers entered by user

public class max_min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first integer = ");
        int a = input.nextInt();
        System.out.print("enter second  integer = ");
        int b = input.nextInt();
        System.out.print("enter third integer = ");
        int c = input.nextInt();
        maxx(a,b,c);
        minn(a,b,c);
    }
    public static void maxx(int a, int b, int c){
        int max = a;
        if (b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("the max value is "+ max );
    }
    public static void minn(int a, int b , int c){
        int min = a;
        if (b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        System.out.println("the min value is "+ min );


    }
}
