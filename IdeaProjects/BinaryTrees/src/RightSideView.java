import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    //https://leetcode.com/problems/binary-tree-right-side-view/
    //just get the last element of the level
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result= new ArrayList<>();
        if(root==null){
            //empty tree
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);//adding the root node in the queue
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                if(i==levelSize-1){
                    result.add(currentNode.val);
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return result;
    }
}
