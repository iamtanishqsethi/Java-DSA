import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/binary-tree-preorder-traversal/
public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            List<Integer> list=new ArrayList<>();
            return list;
        }
        List<Integer> list= new ArrayList<>();
        list.add(root.val);
        list.addAll(preorderTraversal(root.left));
        list.addAll(preorderTraversal(root.right));
        return list;
    }
}
