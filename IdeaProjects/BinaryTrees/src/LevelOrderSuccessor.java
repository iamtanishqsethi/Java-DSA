import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessor {
    //https://www.geeksforgeeks.org/level-order-successor-of-a-node-in-binary-tree/
    public TreeNode successor(TreeNode root,int key){
        if(root==null){
            //empty tree
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);//adding the root node in the queue
        while(!queue.isEmpty()){
            TreeNode currentNode=queue.poll();
            if(currentNode.left!=null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right!=null){
                queue.offer(currentNode.right);
            }
            if(currentNode.val==key){
                break;

            }
        }
        // Return the next node in the queue if there is one, otherwise return null
        return queue.isEmpty() ? null : queue.peek();

    }
}
