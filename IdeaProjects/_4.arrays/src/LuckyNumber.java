import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/?envType=daily-question&envId=2024-07-19
public class LuckyNumber {//help taken
    //TODO:reattempt it later
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> rowMin=new ArrayList<>();
        List<Integer> colMax=new ArrayList<>();
        //finding minimum in each row
        for (int i = 0; i < matrix.length; i++) {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                min=Math.min(min,matrix[i][j]);
            }
            rowMin.add(min);
        }

        //finding maximum in each column
        for(int j=0;j<matrix[0].length;j++){
            int max= Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                max=Math.max(max,matrix[i][j]);
            }
        }
        //luckynumber
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==rowMin.get(i)&&matrix[i][j]==colMax.get(j)){
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }
}
