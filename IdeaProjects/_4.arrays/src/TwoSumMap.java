import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {//
    //https://leetcode.com/problems/two-sum/description/
    //solving using hash map
    //approach-> solving in O(n) time complexity
    //we have a hashmap of integers , key = the number , value= the index
    //if the hashmap contains the target value - number from the array
    //i.e. the difference of that number exist in map
    //also check if the index  is  not same (ie the value in map) if yes
    //return the index of both else
    //put it in the map
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i){
                return new int[] {map.get(target-nums[i]),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
