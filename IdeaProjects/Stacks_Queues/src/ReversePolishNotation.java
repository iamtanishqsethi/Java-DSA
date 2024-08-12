import java.util.Stack;
//https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int ans=0;
        for(String str:tokens){
            if(!str.equals("+")&&!str.equals("-")&&!str.equals("*")&&!str.equals("/")){
                stack.push(str);
            }
            else{
                int secondValue=Integer.parseInt(stack.pop());
                int firstValue=Integer.parseInt(stack.pop());
                stack.push(perform(firstValue,secondValue,str));

            }

        }
        ans=Integer.parseInt(stack.pop());
        return ans;
    }
    private String perform(int first,int second,String str){
        int value=0;
        switch (str){

            case ("+"):
                value=first+second;
                return Integer.toString(value);
            case ("-"):
                value=first-second;
                return Integer.toString(value);
            case ("*"):
                value=first*second;
                return Integer.toString(value);
            case ("/"):
                value=first/second;
                return Integer.toString(value);

        }
        return Integer.toString(value);

    }
}
