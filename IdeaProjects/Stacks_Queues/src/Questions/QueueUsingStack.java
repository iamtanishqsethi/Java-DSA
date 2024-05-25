package Questions;

import java.util.Queue;
import java.util.Stack;
//https://leetcode.com/problems/implement-queue-using-stacks/description/
//solution not exactly for leetcode
public class QueueUsingStack {
     private Stack<Integer> first;
     private Stack<Integer> second;
     public QueueUsingStack(){
         first=new Stack<>();
         second=new Stack<>();
     }
     public void add(int item){
         first.push(item);
     }
     public int remove() throws Exception{
         while(!first.isEmpty()){
             second.push(first.pop());
         }
         int remove=second.pop();
         while (!second.isEmpty()){
             first.push(second.pop());
         }
         return remove;
     }
     public int peek() throws Exception{//exactly same as remove, just peeking
         while(!first.isEmpty()){
             second.push(first.pop());
         }
         int peek=second.peek();
         while (!second.isEmpty()){
             first.push(second.pop());
         }
         return peek;
     }
    public boolean isEmpty(){
        return first.isEmpty();
    }


}
