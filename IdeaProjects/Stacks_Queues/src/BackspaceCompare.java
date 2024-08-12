import java.util.Stack;
//https://leetcode.com/problems/backspace-string-compare/
public class BackspaceCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackS=new Stack<>();
        Stack<Character> stackT=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch!='#')
                stackS.push(ch);
            else if (!stackS.isEmpty()) {
                stackS.pop();
            }
        }
        for(char ch:t.toCharArray()){
            if(ch!='#')
                stackT.push(ch);
            else if (!stackT.isEmpty()) {
                stackT.pop();
            }
        }
        if(stackT.size()!=stackS.size())
            return false;
        while (!stackT.isEmpty()&&!stackS.isEmpty()){
            if(stackS.pop()!=stackT.pop()){
                return false;
            }
        }
        return true;
    }
}
