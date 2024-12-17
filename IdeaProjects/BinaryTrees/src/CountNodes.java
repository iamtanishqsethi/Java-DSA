import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    //count the total nodes in a complete binary tree
    //https://leetcode.com/problems/count-complete-tree-nodes/
    //current approach using BFS = O(n) very slow
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue= new LinkedList<>();
        int count=1;
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                if(currentNode.left!=null){
                    count++;
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    count++;
                    queue.offer(currentNode.right);
                }
            }
        }
        return count;
    }
}
