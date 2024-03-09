public class N_Queens {
    /*
    * we have a N*N chess board, we have to place N queens on the board,
    * such that they do not eliminate each other
    */
    public static void main(String[] args) {
        int n =4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
;    }
    static int queens(boolean[][] board,int row){
        //base case, if row reaches the end
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        //placing the queen and checking for every row and col
        for(int col=0;col<board.length;col++){
            //place the queens if t is safe
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board,row+1);
                //backtrack
                board[row][col]=false;
            }
        }
        return count;
    }
    static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //checking the col from 0 to row
        for(int i =0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        //left diagonal
        int maxleft = Math.min(row,col);
        for(int i =1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        //right diagonal
        int maxright = Math.min(row,board.length-col-1);
        for(int i =1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        //if everything ok return true
        return true;
    }
}
