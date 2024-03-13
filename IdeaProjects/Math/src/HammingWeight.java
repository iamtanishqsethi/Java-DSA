public class HammingWeight {
    //https://leetcode.com/problems/number-of-1-bits/
    //to count the no. of 1 in a binary no.
    //does not work for 11111111111111111111111111111101

    public static int hammingWeight(int n){
        int count =0;
        while(n>0){
            if(n== Integer.MIN_VALUE){
                count--;
                break;
            }
            count++;
            n=n&(n-1);//removes the right most "1" bit from the number
        }
        return count;
    }
}
