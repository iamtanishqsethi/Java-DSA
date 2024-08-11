import java.util.*;
//https://www.geeksforgeeks.org/reversing-first-k-elements-queue/
public class ReverseKQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Queue<Integer> ans=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }

        //add to new queue
        for (int i = 0; i < k; i++) {
            ans.add(stack.pop());
        }
        //add remaining elements
        while(!q.isEmpty()){
            ans.add(q.remove());
        }

        return ans;
    }
}
