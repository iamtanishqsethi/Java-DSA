public class BalancedTree {
    //https://leetcode.com/problems/balanced-binary-tree/
    //
    boolean balanced=true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return balanced;
    }
    private int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=helper(root.left);
        int rightHeight=helper(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            balanced=false;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }
}
