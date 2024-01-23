public class SumOfRowPasscals {
    //sum of each row in pascals triangle
    public static void main(String[] args) {
        int n=3;
        int ans=1<<(n-1);//n-1 because of property of pascals triangle
        /*
        left shift for a<<b is
        a*(2 raise to power b)
         */
        System.out.println(ans);
    }
}
