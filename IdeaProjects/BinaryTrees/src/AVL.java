public class AVL {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value=value;

        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public AVL(){

    }
    public int height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }
    public void display(){
        display(root,"Root node:");
    }
    private void display(Node node, String details){
        if(node==null){
            return;
        }
        System.out.println(details+node.getValue());
        display(node.left," left child of "+node.getValue()+":");
        display(node.right,"  right child of "+node.getValue()+":");

    }
    public void insert(int value){
        root=insert(value,root);
    }

    private Node insert(int value, Node node){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(value,node.left);
        }
        if(value>node.value){
            node.right=insert(value,node.right);
        }
        node.height=Math.max(height(node.left),height(node.right))+1;
        return rotate(node);
    }
    private Node rotate(Node node){
        if(height(node.left)-height(node.right)>1){
            //left heavy
            if(height(node.left.left)-height(node.left.right)>0){
                //left-left case
                return rightRotate(node);
            }if(height(node.left.left)-height(node.left.right)<0){
                //left-right case
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }

        }
        if(height(node.left)-height(node.right)<-1){
            //right heavy
            if(height(node.right.left)-height(node.right.right)<0){
                //right-right case
                return leftRotate(node);
            }if(height(node.right.left)-height(node.right.right)>0){
                //right-left case
                node.right=rightRotate(node.right);
                return leftRotate(node);
            }

        }

        return node;
    }
    private Node rightRotate(Node p){
        Node c=p.left;
        Node t=c.right;
        c.right=p;
        p.left=t;
        //update heights
        p.height=Math.max(height(p.left),height(p.right));
        c.height=Math.max(height(c.left),height(c.right));
        return c;
    }
    private Node leftRotate(Node c){
        Node p=c.right;
        Node t=p.left;
        p.left=c;
        c.right=t;
        //update heights
        p.height=Math.max(height(p.left),height(p.right));
        c.height=Math.max(height(c.left),height(c.right));
        return p;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 &&balanced(node.left)&&balanced(node.right);
        // we have to check for the sub node of the root and also for the left and right side tree of each particular node
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);

    }
    private void populateSorted(int[] nums,int start,int end){
        //O(h*logn)
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);//left side
        populateSorted(nums,mid+1,end);//right side
    }
}
