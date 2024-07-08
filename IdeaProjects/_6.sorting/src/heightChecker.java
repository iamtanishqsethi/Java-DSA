import java.util.Arrays;

public class heightChecker {//
    //https://leetcode.com/problems/height-checker/
    public static void main(String[] args) {
        int[] heights={5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int count=0;
        int[] copy=Arrays.copyOf(heights,heights.length);
        Arrays.sort(copy);
        for(int i=0;i<heights.length;i++){
            if(copy[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
