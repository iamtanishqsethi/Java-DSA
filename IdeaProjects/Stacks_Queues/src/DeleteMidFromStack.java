import java.util.ArrayList;
import java.util.Stack;
//https://www.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1
public class DeleteMidFromStack {

    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        int mid=sizeOfStack/2;
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            arr.add(s.pop());
        }
        s.pop();
        for (int i = mid-1; i >=0 ; i--) {
            s.push(arr.get(i));
        }
    }
}
