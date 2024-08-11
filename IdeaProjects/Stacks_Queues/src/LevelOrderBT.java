import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBT {//TODO:reattempt
    //https://www.geeksforgeeks.org/print-level-order-traversal-line-line/
    public static ArrayList <ArrayList<Integer>> binTreeSortedLevels (int arr[], int n) {
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        if(n==0){
            return result;
        }
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(0);
        while (!queue.isEmpty()){
            int currentLevelSize=queue.size();
            ArrayList<Integer> currentLevel=new ArrayList<>(currentLevelSize);
            for (int i = 0; i < currentLevelSize; i++) {
                int currentIndex=queue.poll();
                currentLevel.add(arr[currentIndex]);
                int leftChildIndex=currentIndex*2 +1;
                int rightChildIndex=currentIndex*2 +2;

                if(leftChildIndex<n){
                    queue.offer(leftChildIndex);
                }
                if(rightChildIndex<n){
                    queue.offer(rightChildIndex);
                }
            }
            Collections.sort(currentLevel);  // Sort the current level before adding to the result
            result.add(currentLevel);
        }
        return result;
    }
}
