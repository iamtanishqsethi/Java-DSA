import java.util.Arrays;
//to return the index of the two numbers whose sum is equal to target
public class two_sum {
    public static void main(String[] args) {
        int[] arr ={3,2,3};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int start=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }return ans;
    }
}
