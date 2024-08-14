import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class AllDuplicate {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while (i< nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){
                ans.add(nums[i]);
            }
            i++;
        }
        return ans;
    }
    private void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
