import java.util.Arrays;

public class SquareSorted {
    public int[] sortedSquares(int[] nums) {
        square(nums);
        Arrays.sort(nums);
        return nums;

    }
    void square(int[] nums){
        for(int i=0;i< nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
    }

}
