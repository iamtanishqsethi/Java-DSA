import java.sql.SQLOutput;

public class SegmentTree {
    public static void main(String[] args) {
        int[] arr={3,8,6,7,-2,-8,4,9};
        SegmentTree tree=new SegmentTree(arr);
    }
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
        public Node(int startInterval,int endInterval){
            this.startInterval=startInterval;
            this.endInterval=endInterval;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
        this.root=constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[] arr,int start,int end){
        if(start==end){
            //leaf node
            Node leaf = new Node(start,end);
            leaf.data=arr[start];
            return leaf;
        }
        //creating new node with index we are currently at
        Node node=new Node(start,end);
        int mid=(start+end)/2;

        node.left=constructTree(arr,start,mid);
        node.right=constructTree(arr,mid+1,end);

        //updating the value of the node
        node.data =node.left.data+node.right.data;
        return node;
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str="";
        //left node
        if(node.left!=null){
            str=str+"Interval=["+node.left.startInterval+"-"+node.left.endInterval+"] and Data= "+node.left.data+"=>";

        }else{
            str=str+"No left child";
        }
        //current node
        str=str+"Interval=["+node.startInterval+"-"+node.endInterval+"] and Data= "+node.data;
        if(node.right!=null){
            str=str+"Interval=["+node.right.startInterval+"-"+node.right.endInterval+"] nad Data= "+node.right.data;

        }
        //right node
        else{
            str=str+"No right child";
        }
        System.out.println(str);
        //recursion
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }
    //query
    public int query(int queryStartIndex,int queryEndIndex){
        return this.query(this.root,queryStartIndex,queryEndIndex);
    }
    private int query(Node node,int queryStartIndex,int queryEndIndex){
        //lies completely inside
        if(node.startInterval>=queryStartIndex && node.endInterval<=queryEndIndex){
            return node.data;
        }
        //completely outside
        else if (node.startInterval>queryEndIndex||node.endInterval<queryStartIndex) {
            return 0;
        }
        //overlapping
        else{
            return this.query(node.left,queryStartIndex,queryEndIndex) + this.query(node.right,queryStartIndex,queryEndIndex);
        }
    }
    public void update(int index,int value){
        this.root.data=update(this.root,index,value);
    }
    private int update(Node node,int index,int value){
        //checking if index lies in range
        if(index>=node.startInterval &&index<=node.endInterval){
            //if answer found
            if(index==node.startInterval&&node.endInterval==index){
                node.data=value;
                return node.data;
            }
            else{//else look for value in left child and right child
                int leftValue=update(node.left,index,value);
                int rightValue=update(node.right,index,value);
                node.data=leftValue+rightValue;
                return node.data;
            }
        }
        //else case  does not lie in the range ,just return original value
        return node.data;
    }
}
