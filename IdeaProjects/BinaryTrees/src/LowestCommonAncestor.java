public class LowestCommonAncestor {
    //https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
    //we need to find answer closer to the root - preorder
    /*
    * check if p OR q is equal to the root then return the root as answer , no need to go down end that call
    * then go to left or right side
    * if right& left != null the answer is the current node
    *
    * but what if the other side returns null , that means the other node lies in the area we previously ignored
    * i.e. the nodes under the first found node
    * */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p||root==q){
            return root;
        }
        TreeNode leftNode=lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode=lowestCommonAncestor(root.right,p,q);
        if(leftNode!=null&&rightNode!=null){
            return root;
        }
        return leftNode==null?rightNode:leftNode;
    }
}
