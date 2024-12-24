import java.util.*;
//https://leetcode.com/problems/3sum/
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //O(n2) still bad
        //learn two pointers for O(n)
        List<List<Integer>> outer=new ArrayList<>();
        if(nums.length<3){
            return outer;
        }
        //sorting to remove duplicates
        Arrays.sort(nums);
        for(int i=0; i< nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;//skipping duplicates
            }
            int target=-nums[i];

            Map<Integer,Integer> map = new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                if(i!=j && map.containsKey(target-nums[j]) ){
                    List<Integer> inner=new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[j]);
                    inner.add(target-nums[j]);
                    outer.add(inner);
                    while(j+1< nums.length&&nums[j]==nums[j+1]){
                        j++;//skipping duplicates in other two numbers
                    }
                }
                map.put(nums[j],j);
            }
        }
        return outer;
    }
}
