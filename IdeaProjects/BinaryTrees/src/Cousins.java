public class Cousins {
    //https://leetcode.com/problems/cousins-in-binary-tree/
    //cousins is same level different parent
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode node1=findNode(root,x);
        TreeNode node2=findNode(root,y);

        return ((level(root,node1,0))==level(root,node2,0))&&(
                !isSibling(root,node1,node2));

    }
    private TreeNode findNode(TreeNode node ,int value){
        if(node==null){
            return null;
        }
        if(node.val==value){
            return node;
        }
        TreeNode leftNode=findNode(node.left,value);
        if(leftNode!=null){
            return leftNode;
        }
        return findNode(node.right,value);
    }
    private boolean isSibling(TreeNode node,TreeNode node1,TreeNode node2){
        if(node==null){
            return false;
        }
        return ((node.left==node1 && node.right==node2) || (node.right==node1 && node.left==node2)||isSibling(node.left,node1,node2)||isSibling(node.right,node1,node2));
    }
    private int level(TreeNode node,TreeNode x,int level){
        if(node==null){
            return 0;
        }
        if(node==x){
            return level;
        }
        int left=level(node.left,x,level+1);
        if(left!=0){
            return left;
        }
        return level(node.right,x,level+1);
    }

}
