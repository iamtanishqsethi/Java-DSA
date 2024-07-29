import com.sun.source.tree.Tree;

public class SumRootToLeaf {
    //https://leetcode.com/problems/sum-root-to-leaf-numbers/
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    private int helper(TreeNode node,int sum){
        if(node==null){
            return 0;
        }
        sum=sum*10+node.val;
        //if you reached the leaf node just return that value of sum ,do not call helper
        if(node.left==null&&node.right==null){
            return sum;
        }
        return helper(node.left,sum)+helper(node.right,sum);
    }

}
