import java.util.Scanner;
//greatest numbers till user enters 0
public class gratest_num_till_zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0;
        while(true){
            System.out.print("enter integer or enter zero to print result = ");
            int i = input.nextInt();
            if(i==0){
                break;

            }else{
                if(max<i){
                    max = i;
                }
            }
        }
        System.out.println("the max integer entered is = "+max);
    }
}
