import java.util.Arrays;

public class RotateArray {
//https://leetcode.com/problems/rotate-array/
    public  void rotate(int[] nums, int k) {
        k=k% nums.length;
        if(k==0) return;
        int firstInd= nums.length-k;
        int[] arr= new int[nums.length];
        int index=0;
        for(int i=firstInd;i< nums.length;i++){
            arr[index]=nums[i];
            index++;
        }
        for(int i=0;i<firstInd;i++){
            arr[index]=nums[i];
            index++;
        }
        for(int i=0;i< nums.length;i++){
            nums[i]=arr[i];
        }
    }
}
