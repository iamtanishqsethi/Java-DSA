import java.util.Arrays;

public class CountBits {
    //https://leetcode.com/problems/counting-bits/description/
    //to count the no of bits in the no and add it to the array
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));

    }
    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        int x,bits;
        for(int i=0;i<=n;i++){
            x=i;
            bits=0;
            while(x>0){
                bits++;
                x=x&(x-1);
            }
            arr[i]=bits;

        }
        return arr;

    }
}
