public class FirstMissingPositive {
    //https://leetcode.com/problems/first-missing-positive/
    public int firstMissingPositive(int[] nums) {
        //cyclic sort all the positive numbers
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        //search for the missing number
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        //if no missing positive till length of array
        return nums.length+1;
    }
    private void swap(int[] nums,int i , int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
}
