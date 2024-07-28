public class Validate {
    //https://leetcode.com/problems/validate-binary-search-tree/
    //preorder
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    private boolean helper(TreeNode node,Integer low,Integer high){
        if(node==null){
            return true;
        }
        if((low!=null)&&(node.val<=low)||(high!=null)&&(node.val>=high)){
            return false;
        }
        boolean leftTree=helper(node.left,low,node.val);
        boolean rightTree=helper(node.right,node.val,high);
        return leftTree&&rightTree;
    }
}
