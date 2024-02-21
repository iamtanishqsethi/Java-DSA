public class N_Knights {
    /*
    * We are given an N*N board , we have ro place N knights on the board,
    * such that they do not eliminate each other
    *
    * (different approach on the N queens problem ,
    *  here we are taKing the row, col and no of knights in the argument)
    *  */
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knights(board,0,0,n);
    }
    static void knights(boolean[][] board , int row,int col,int knights){
        //base case ,if the no.of knights become 0
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }
        //if we reach the end of that row AND at the end of that col , we return
        if(row==(board.length-1) && col==(board.length)){
            return;
        }
        //if we still have some rows left but the col ended , we move to the next row
        if(col==board.length){
            knights(board,row+1,0,knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            knights(board,row,col+1,knights-1);
            //back tracking
            board[row][col]=false;
        }
        knights(board,row,col+1,knights);
    }
    static boolean isSafe(boolean[][] board,int row,int col){
        //4 types of movement of a knight

        //1st type
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }

        }
        //2nd type
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }

        }
        //3rd type
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }

        }
        //4th type
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }

        }
        return true;
    }

    static boolean  isValid(boolean[][] board,int row, int col){
        //function to avoid out of bound errors
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
