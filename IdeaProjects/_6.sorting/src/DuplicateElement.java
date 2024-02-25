import java.util.Arrays;

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

}
