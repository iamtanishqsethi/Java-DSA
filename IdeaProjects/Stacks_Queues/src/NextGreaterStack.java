import java.util.Locale;
import java.util.Stack;
//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?page=1&category=Stack&sortBy=submissions
public class NextGreaterStack {
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] ans= new long[arr.length];
        Stack<Long> stack=new Stack<>();
        //checking from end
        for (int i = n-1; i >=0 ; i--) {
            //if stack is not empty and top element is smaller than current element pop it
            while (!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            //if stacks is not empty the next greater is top element
            ans[i]=(stack.isEmpty())?-1:stack.peek();
            //pushing the current element
            stack.push(arr[i]);
        }
        return ans;
    }
}
