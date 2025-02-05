public class ReverseNumber {
    //https://leetcode.com/problems/reverse-integer/
    public static int reverse(int x) {
        boolean negative=false;
        int copy;
        if(x<0){
            negative=true;
            copy=-x;
        }else{
            copy=x;
        }
        int reverse=0;
        while (copy>0){
            int rem=copy%10;
            if (reverse > (Integer.MAX_VALUE / 10) || (reverse == Integer.MAX_VALUE / 10 && rem > 7)) { // 7 is the last digit of Integer.MAX_VALUE
                return 0;
            }
            reverse=reverse*10+rem;
            copy/=10;
        }
        if(negative){
            return -reverse;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1230000));
    }
}
