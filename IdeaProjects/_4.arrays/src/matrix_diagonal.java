public class matrix_diagonal {
    //sum of primary and secondary diagonal
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++){//primary diagonal
            sum+=mat[i][i];
        }for(int i =0;i<mat.length;i++){//secondary diagonal
            for(int j =0;j<mat[i].length;j++){
                if(i+j==mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }if(mat.length%2!=0){//to avoid repetion  of centre value in odd order matrix
            int i =mat.length/2;
            sum-=mat[i][i];
        }return sum;
    }
}
