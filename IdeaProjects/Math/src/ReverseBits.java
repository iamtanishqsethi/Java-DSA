public class ReverseBits {
    //https://leetcode.com/problems/reverse-bits/description/

    public static void main(String[] args) {
        System.out.println(reverseBits(101011));
    }public static int reverseBits(int n) {
        int  reverse=0;
        for(int i =0;i<32;i++){
            reverse<<=1;//left shifting reverse by 1
            //the left most bit if reverse is zero and we will or it with the left most bit of n , which we get by n&1
            reverse |=(n&1);
            n>>=1;//right shifting n by one bit
        }
        return reverse;

    }
}
