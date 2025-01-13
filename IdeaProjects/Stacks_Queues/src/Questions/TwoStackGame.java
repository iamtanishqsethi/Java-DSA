package Questions;
import java.util.Arrays;
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem
public class TwoStackGame {
    //similar to the subsequence questions in recursion
    static int twoStacks(int maxSum,int[] a,int[] b){
        return helper(maxSum,a,b,0,0)-1;
        //-1 because the last count/move was responsible for exceeding the sum
        //& we need the max no of moves that make the sum less than max Sum
    }
    private static int helper(int maxSum,int[] a,int[] b,int sum,int count){
        if(sum>maxSum){
            return count;
        }
        //if any of the arrays/stacks got empty
        if(a.length==0||b.length==0){
            return count;
        }
        int ansLeft=helper(maxSum, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
        int ansRight=helper(maxSum, a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);

        return Math.max(ansLeft,ansRight);
    }
}
