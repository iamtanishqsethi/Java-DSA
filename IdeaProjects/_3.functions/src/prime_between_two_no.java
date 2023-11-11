import java.util.Scanner;
//to display all the prime numbers in between two numbers
public class prime_between_two_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter lower limit = ");
        int a = in.nextInt();
        System.out.print("enter upper limit = ");
        int b = in.nextInt();
        prime(a,b);
    }
    public static void prime(int a,int b){
        for (int i = a;i<=b;i++){
            if (i==1 ||i==0){
                continue;
            }
            int flag =1;
            for(int j=2;j<=i/2;j++){
                if (i%j==0){
                    flag = 0;
                    break;
                }

            }if (flag==1){
                System.out.print(i+",");
            }
        }
    }

}
