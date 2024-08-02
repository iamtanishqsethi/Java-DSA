import java.util.Stack;
//https://leetcode.com/problems/decode-string/
public class DecodeString {//
    public String decodeString(String s){
        Stack<Integer> numStack= new Stack<>();
        Stack<StringBuilder> charStack= new Stack<>();
        StringBuilder currentString= new StringBuilder();
        int num=0;//for repetitions
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){//for more than one digit cases
                num=num*10+(ch-'0');
            } else if (ch=='[') {
                numStack.push(num);
                charStack.push(currentString);
                currentString=new StringBuilder();
                num=0;
            }
            else if(ch==']'){
                StringBuilder temp=currentString;
                currentString=charStack.pop();
                for (int i=numStack.pop();i>0;i--){
                    currentString.append(temp);
                }
            }
            else {
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }
}
