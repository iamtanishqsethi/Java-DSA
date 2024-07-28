public class MaxDepth {
    //https://leetcode.com/problems/maximum-depth-of-binary-tree/
    //A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftHeight=maxDepth(root.left);
        int rightHeight=maxDepth(root.right);
        int depth=Math.max(leftHeight,rightHeight)+1;
        return depth;
    }
}
