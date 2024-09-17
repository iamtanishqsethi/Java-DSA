public class RemoveDuplicates {//reattempt again
    //https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int j=0;//pointer for the unique sorted part
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];//replacing the previous element with the current unique element
            }
        }
        return j+1;//returning the number of elements
    }
}
