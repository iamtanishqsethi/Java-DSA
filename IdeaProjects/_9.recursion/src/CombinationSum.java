import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/combination-sum/
public class CombinationSum {//
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, ans, candidates, target, new ArrayList<>());
        return ans;
    }

    private void helper(int index, List<List<Integer>> ans, int[] arr, int target, List<Integer> current) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(current));
            }
            return;
        }

        if (arr[index] <= target) {
            current.add(arr[index]);
            helper(index, ans, arr, target - arr[index], current);
            //backtrack
            current.remove(current.size() - 1);
        }
        helper(index + 1, ans, arr, target, current);
    }
}