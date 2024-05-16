import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class InbuiltExample {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(55);
//        stack.push(45);
//        stack.push(66);
//
//        //stack.pop actually returns the value ;here integer
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        //if nothing is present in stack and if we pop iit will result in exception
//
//        Queue<Integer> queue= new LinkedList<>();
//        //internally queue is an interface , not a class
//        // we can use LinkedList class (similarity)
//        queue.add(3);
//        queue.add(6);
//        queue.add(9);
//        queue.add(12);
//        System.out.println(queue.peek());//return the head without removing it
        Deque<Integer> deque= new ArrayDeque();
        deque.add(89);
        deque.addFirst(77);
    }
}
