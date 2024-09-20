import java.util.Stack;
//https://leetcode.com/problems/asteroid-collision/description/?envType=problem-list-v2&envId=mzmav2ii
public class AsteroidCollision {//help taken
    //-ve asteroid means going left and +ve asteroid means going right
    //condition for destruction
    //if  the previous  asteroid is travelling right and the next is going left
    //the asteroid with the lower absolute value is removed from stack
    //if its same both are removed
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack= new Stack<>();
        for(int ast:asteroids){
            if(ast>0){
                //positive value
                stack.push(ast);
            }
            else{
                while (!stack.isEmpty()&&stack.peek()>0&&stack.peek()<-ast){
                    stack.pop();//removing all the elements that are smaller than the abs value of current
                }
                if(stack.isEmpty()||stack.peek()<0){
                    stack.push(ast);
                }
                if(stack.peek()==-ast){
                    //both have same abs value
                    stack.pop();
                }
            }
        }
        int[] ans=new int[stack.size()];
        int i= ans.length-1;
        while(!stack.isEmpty()){
            ans[i]=stack.pop();
            i--;
        }
        return ans;
    }
}
