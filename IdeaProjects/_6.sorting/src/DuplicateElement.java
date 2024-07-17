import java.util.Arrays;
//https://leetcode.com/problems/find-the-duplicate-number/
//https://leetcode.com/problems/contains-duplicate/
public class DuplicateElement {
    public static void main(String[] args) {
        int[] nums= {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        boolean ans = false;
        int i =0;
        Arrays.sort(nums);
        while(i<nums.length){
            if(i+1<nums.length&&nums[i]==nums[i+1]){
                ans=true;
                break;
            }
            i++;
        }
        return ans;
    }
    public int findDuplicate(int[] nums) {
        //sort
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[correct]!=nums[i]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }else{
                if(i!=correct){//duplicate found
                    return nums[i];
                }
                i++;
            }
        }
        return -1;
    }


}

