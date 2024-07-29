public class MaxPathSum {
    //TODO:revisit this question
    //https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
    int ans= Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
     int helper(TreeNode node){
        if(node==null){
            return 0;
        }

        int leftSum=helper(node.left);
        int rightSum=helper(node.right);
        //ignoring negatives
         leftSum=Math.max(leftSum,0);
         rightSum=Math.max(rightSum,0);

        int pathSum=leftSum+rightSum+ node.val;
        ans=Math.max(ans,pathSum);

        return Math.max(leftSum,rightSum)+ node.val;
     }
}
