package KadaneAlgorithm;

public class BruteForce {
    //calculate the sum of each possible sub array
    //then find out the max sum from all the sums
    //O(n^3)
    public static  int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        //'i' tells the starting of sub array
        for(int i=0;i< nums.length;i++){
            //j tells the ending of sub array
            for(int j=i;j<nums.length;j++){
                int sum=0;
                //k goes from [i,j]
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                maxSum=Math.max(maxSum,sum);
            }

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArray(nums));
    }
}
