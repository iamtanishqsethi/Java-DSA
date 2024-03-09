public class CountZero {//Special Example
    public static void main(String[] args) {
        System.out.println(countNum(30204));
    }
    static int countNum(int n){
        return helper(n,0);
    }
    /*
     helper function passes the same value back to above value and
     is returned once back to original function
     */
    private static int helper(int n,int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,count+1);
        }else{
            return helper(n/10,count);
        }
    }
}
