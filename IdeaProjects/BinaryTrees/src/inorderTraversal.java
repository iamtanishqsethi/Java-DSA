import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
    private void inorder(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
