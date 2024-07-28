public class KthSmallest {
    //https://leetcode.com/problems/kth-smallest-element-in-a-bst/
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        //inorder traversal
        return helper(root,k).val;

    }
    private TreeNode helper(TreeNode root,int k){
        if(root==null){
            return null;
        }
        TreeNode leftNode=helper(root.left,k);
        if(leftNode!=null){
            return leftNode;
        }
        count++;
        if(count==k){
            return root;
        }
        return helper(root.right,k);
    }
}
