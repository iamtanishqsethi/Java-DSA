public class FlattenBinaryTree {//
    //https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
    //https://youtu.be/9D-vP-jcc-Y?feature=shared&t=9597
    //using pre order traversal

    public void flatten(TreeNode root) {
        TreeNode current=root;
        while(current!=null){
            if(current.left!=null){
                TreeNode temp=current.left;
                while (temp.right!=null){
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;
            }
            current=current.right;
        }
    }
}
