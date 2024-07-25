import java.util.*;

public class ZigzagLevelOrder {
    //https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result= new ArrayList<>();
        if(root==null){
            //empty tree
            return result;
        }
        Deque<TreeNode> queue=new LinkedList<>();
        queue.offer(root);//adding the root node in the queue
        boolean reverse=false;//flag for reverse traversal
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            List<Integer> currentLevel=new ArrayList<>(levelSize);
            for(int i=0;i<levelSize;i++){
                if(!reverse){
                    TreeNode currentNode=queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if(currentNode.left!=null){
                        queue.addLast(currentNode.left);
                    }
                    if(currentNode.right!=null){
                        queue.addLast(currentNode.right);
                    }
                }
                else{
                    TreeNode currentNode=queue.pollLast();
                    currentLevel.add(currentNode.val);
                    if(currentNode.right!=null){
                        queue.addFirst(currentNode.right);
                    }
                    if(currentNode.left!=null){
                        queue.addFirst(currentNode.left);
                    }

                }

            }
            reverse=!reverse;//flipping the flag
            result.add(currentLevel);
        }
        return result;
    }
}
