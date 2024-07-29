public class PathSum {
    //https://leetcode.com/problems/path-sum/
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        if(root.val==targetSum &&root.left==null && root.right==null ){
            //currently at leaf node and sum is equal
            //answer found
            return true;
        }
        //check in left and right
        return hasPathSum(root.left,targetSum-root.val)||hasPathSum(root.right,targetSum- root.val);
    }
}
