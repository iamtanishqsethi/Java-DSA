import java.util.Arrays;
//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
public class ConstructBinaryTree2 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(postorder.length==0){
            return null;
        }
        int rootEle=postorder[postorder.length-1];
        int index=0;
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i]==rootEle){
                index=i;
            }
        }
        TreeNode root= new TreeNode(rootEle);
        root.left=buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));
        root.right=buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index,postorder.length-1));
        return root;
    }
}
