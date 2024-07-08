import java.util.Arrays;

public class maxProduct {
    //https://leetcode.com/problems/maximum-product-of-three-numbers/
    //hint taken
    //TODO:revisit this question again
    public static void main(String[] args) {
        int[] nums={-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));

    }
    public static int maximumProduct(int[] nums) {
        int maxProduct1=0;
        int maxProduct2=0;
        Arrays.sort(nums);
        maxProduct1= nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        maxProduct2=nums[0]*nums[1]*nums[nums.length-1];
        if(maxProduct1>maxProduct2){
            return maxProduct1;
        }
        else return maxProduct2;
    }
}
