import java.util.Arrays;
//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
public class CanMakeAP {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int CommonDifference = arr[1]-arr[0];
        int i =1;
        while(i< arr.length){
            if(arr[i]-arr[i-1]!=CommonDifference){
                return false;
            }
            i++;
        }return true;
    }
}
