public class DiameterOfTree {
    //https://leetcode.com/problems/diameter-of-binary-tree/
    //The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
    //This path may or may not pass through the root.
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    private int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        int dia=leftHeight+rightHeight+1;
        diameter=Math.max(dia,diameter);
        return Math.max(leftHeight,rightHeight)+1;
    }
    //which kind  of traversal ?
}
