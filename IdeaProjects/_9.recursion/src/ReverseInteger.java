public class ReverseInteger {
//to reverse an integer
    static int sum =0;
    static void rev1(int n){//first way to reverse an integer
        if(n==0){
            return ;
        }
        int rem=n%10;
        sum =sum*10 + rem;
        rev1(n/10);
    }
    static int rev2(int n){//second way
        /*
        sometimes you might need some additional variables in the argument
        In that case , you make another function
         */
        int digits = (int)(Math.log10(n))+1;//to get number of digits ;math for dsa
        return helper(n,digits);


    }
    private static int helper (int n ,int digits){
        if(n==0){
            return n;
        }
        int rem =n%10;
        return rem*(int) (Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
    public static void main(String[] args) {
        System.out.println(rev2(12345));
    }
}
