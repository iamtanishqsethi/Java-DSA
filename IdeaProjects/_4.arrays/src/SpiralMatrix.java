import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    //https://leetcode.com/problems/spiral-matrix/
    //help taken for the approach https://www.youtube.com/watch?v=BJnMZNwUk1M
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        if (matrix.length == 0) {//empty matrix edge case
            return ans;
        }
        //four pointers
        int left=0;
        int right=matrix[0].length-1;//no of columns
        int top=0;
        int bottom= matrix.length-1;//no of rows
        while((left<=right) && (top<=bottom)){
            //traverse topmost row
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;//move the top  pointer down

            //traverse rightmost column
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;//move the right pointer left

            // Check if there is still a row and column to process
            if (left <= right && top <= bottom) {
                // Traverse bottom row
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--; // Move the bottom pointer up

                // Traverse leftmost column
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++; // Move the left pointer right
            }
        }
        return ans;
    }
}
