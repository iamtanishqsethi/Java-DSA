import java.util.Arrays;
public class running_sum {
    //to return the running sum of array
    public static int[] runningSum(int[] nums) {
        int[] list = new int[nums.length];
        list[0]=nums[0];
        for(int i = 1;i<nums.length;i++){
            list[i]=nums[i]+list[i-1];
        }
        return list;

    }public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        String array = Arrays.toString(runningSum(nums));
        System.out.println(array);
    }
}
