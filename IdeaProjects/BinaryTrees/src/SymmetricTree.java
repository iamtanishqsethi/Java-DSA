import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
    //https://leetcode.com/problems/symmetric-tree/
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode leftNode=queue.poll();
            TreeNode rightNode=queue.poll();
            if(leftNode==null&&rightNode==null){
                continue;
            }
            if(leftNode==null||rightNode==null){
                return false;
            }
            if(leftNode.val!= rightNode.val){
                return false;
            }
            queue.add(leftNode.left);
            queue.add(rightNode.right);
            queue.add(leftNode.right);
            queue.add(rightNode.left);
        }
        return true;
    }
}
