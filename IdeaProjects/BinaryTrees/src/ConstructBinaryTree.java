import java.util.Arrays;

public class ConstructBinaryTree {
    //https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        int rootEle=preorder[0];
        int index=0;
        //finding the element in inorder array
        for (int i = 0; i < inorder.length; i++) {
            if(inorder[i]==rootEle){
                index=i;
            }
        }
        TreeNode node= new TreeNode(rootEle);//root node created
        //left of the node
        node.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        //right of length
        node.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        return node;
    }
}
