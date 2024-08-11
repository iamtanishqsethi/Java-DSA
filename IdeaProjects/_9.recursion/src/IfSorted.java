import java.util.List;
//https://www.geeksforgeeks.org/program-check-array-sorted-not-iterative-recursive/
public class IfSorted {
    public boolean arraySortedOrNot(List<Integer> arr) {
        int size=arr.size();
        return helper(arr,size,0);
    }
    private boolean helper(List<Integer> arr,int size,int index){
        if(index==size-1)
            return true;
        if(arr.get(index)> arr.get(index+1))
            return false;
        return helper(arr,size,index+1);
    }
}
