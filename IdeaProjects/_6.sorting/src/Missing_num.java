public class Missing_num {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int[] nums) {
        //sorting
        int i = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //searching
        for(int x=0;x<nums.length;x++){
            if(x!=nums[x]){
                return x;
            }
        }return nums.length;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }
}
