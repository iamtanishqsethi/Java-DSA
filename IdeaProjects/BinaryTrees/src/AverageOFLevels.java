import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://leetcode.com/problems/average-of-levels-in-binary-tree/
//similar to BFS just storing the sum of each level and then after the inner loop
//dividing it by the number of elements in that level i.e. the current level size
public class AverageOFLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result= new ArrayList<>();
        if(root==null){
            //empty tree
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);//adding the root node in the queue
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            double averageLevel=0;
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode=queue.poll();
                averageLevel+= currentNode.val;
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            averageLevel=averageLevel/levelSize;
            result.add(averageLevel);
        }
        return result;
    }
}
