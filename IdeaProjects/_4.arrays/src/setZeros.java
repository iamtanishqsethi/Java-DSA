import java.util.Arrays;
//https://leetcode.com/problems/set-matrix-zeroes/
public class setZeros {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        int[][] copy=new int[matrix.length][matrix[0].length];
        copyArray(copy,matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    setRowZero(copy,i);
                    setColZero(copy,j);
                }
            }
        }
        copyArray(matrix,copy);

    }
    private static void copyArray(int[][] copy,int[][] matrix){
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                copy[i][j]=matrix[i][j];
            }
        }
    }
    private static void setRowZero(int[][] mat,int row){
        for(int i=0;i<mat[0].length;i++){
            mat[row][i]=0;
        }
    }
    private static void setColZero(int[][] mat,int col){
        for(int i=0;i<mat.length;i++){
            mat[i][col]=0;
        }
    }
}
