public class Palindrome {
    static int rev2(int n){//second way
        /*
        sometimes you might need some additional variables in the argument
        In that case , you make another function
         */
        int digits = (int)(Math.log10(n))+1;//to get number of digits ;math for dsa
        return helper(n,digits);


    }
    private static int helper (int n ,int digits){
        if(n%10==1){
            return n;
        }
        int rem =n%10;
        return rem*(int) (Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
    static boolean palin(int n){
        if(n==rev2(n)){
            return true;
        }return false;
    }
    public static void main(String[] args) {
        System.out.println(palin(123321));
    }

}
