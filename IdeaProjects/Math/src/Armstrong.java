public class Armstrong {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }
    static String armstrongNumber(int n){
        int original =n;
        int temp;
        int arm =0;
        while(n>0){
            temp=n%10;
            arm+=temp*temp*temp;
            n/=10;
        }
        if(original==arm){
            return "Yes";
        }
        return "No";
    }
}
