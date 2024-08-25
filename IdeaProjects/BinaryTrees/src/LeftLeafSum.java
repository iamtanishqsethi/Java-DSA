
public class LeftLeafSum {
    //https://leetcode.com/problems/sum-of-left-leaves/
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root);
        return sum;
    }
    private void helper(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode leftNode=root.left;
        if (leftNode != null && leftNode.left == null && leftNode.right == null) {
            sum += leftNode.val;
        }
        helper(root.left);
        helper(root.right);
    }
}
