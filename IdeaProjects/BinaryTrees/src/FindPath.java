import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class FindPath {
    public boolean findPath(TreeNode node,int[] arr){
        if(node==null){
            return arr.length==0;
        }
        return helper(node,arr,0);
    }
    private boolean helper(TreeNode node,int[] arr,int index){
        if(node==null){
            return false;
        }
        if(index>=arr.length||node.val!=arr[index]){
            return false;
        }
        if(node.left==null&&node.right==null&&index==arr[arr.length-1]){
            return true;
        }
        return helper(node.right,arr,index+1)||helper(node.right,arr,index+1);
    }
    //TODO:do this question again from video
    public int countPath(TreeNode node,int sum){
        List<Integer> path= new LinkedList<>();
        return helper2(node, sum, path);
    }
    private int helper2(TreeNode node, int sum,List<Integer> path){
        if(node==null){
            return 0;
        }
        path.add(node.val);
        int count=0;
        int s=0;
        //how  many paths I can have
        ListIterator<Integer> itr= path.listIterator(path.size());
        while(itr.hasPrevious()){
            s+= itr.previous();
            if(s==sum){
                count++;
            }
        }
        count+=helper2(node.left,sum,path)+helper2(node.right,sum,path);

        //backtrack
        path.remove(path.remove(path.size()-1));


        return count;

    }

    //same logic , we can also put it in a list
    //refer here
    //https://youtu.be/9D-vP-jcc-Y?feature=shared&t=16810
}
