import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class NumPermutations {//
    //different that string permutation
    //used backtracking here
    //TODO:revisit
    //https://leetcode.com/problems/permutations/
    public  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        helper(outer,nums,new ArrayList<Integer>());
        return outer;
    }
    private  void helper(List<List<Integer>> outer,int[] nums,List<Integer> current){
        if(nums.length==current.size()){
            outer.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])) continue;
            current.add(nums[i]);
            helper(outer,nums,current);
            current.remove(current.size()-1);
        }
    }
}
