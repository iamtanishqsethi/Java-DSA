import java.sql.SQLOutput;
import java .util.ArrayList;
import java.util.Arrays;

public class Maze {
       public static void main(String[] args) {
//        System.out.println(pathcount(3,3));
//        path("",3,3);
//        System.out.println(pathret("",3,3));
//        System.out.println(pathretdiagonal("",3,3));
           boolean[][] board = {
                   {true,true,true},
                   {true,true,true},
                   {true,true,true}};
           int[][] path = new int[board.length][board[0].length];
//         pathRestrictions("",board,0,0);
//         AllPaths("",board,0,0);
           AllPathsPrint("",board,0,0,path,1);
    }

    static int pathcount(int row,int col){//to find the number of paths taken to reach end point
        if(row==1||col==1){
            return 1;
        }
        int left = pathcount(row-1,col);
        int right = pathcount(row,col-1);
        return right+left;
    }
    static void path(String proc,int row,int col){//to print the paths
        if(row==1 &&col==1){
            System.out.println(proc);
            return;
        }
        //going towards the vertical side
        if (row>1){
            path(proc+'D',row-1,col);
        }
        //going towards the horizontal side
        if(col>1){
            path(proc+'R',row,col-1);
        }
    }
    static ArrayList<String> pathret(String proc,int row,int col){//to print the paths in arraylist
        if(row==1 &&col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        //going towards the vertical side
        if (row>1){
            list.addAll(pathret(proc+'D',row-1,col));
        }
        //going towards the horizontal side
        if(col>1){
            list.addAll(pathret(proc+'R',row,col-1));
        }
        return list;
    }

    static ArrayList<String> pathretdiagonal(String proc,int row,int col){//if we could go diagonally
        if(row==1 &&col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        //going diagonally
        if(row>1&&col>1){
            list.addAll(pathretdiagonal(proc+'d',row-1,col-1));
        }
        //going towards the vertical side
        if (row>1){
            list.addAll(pathretdiagonal(proc+'D',row-1,col));
        }
        //going towards the horizontal side
        if(col>1){
            list.addAll(pathretdiagonal(proc+'R',row,col-1));
        }
        return list;
    }
    //to print the path if we have obstacles and with variable starting point
    static void pathRestrictions(String proc,boolean[][] maze,int row,int col){
        if(row==maze.length-1 &&col==maze[0].length-1){
            System.out.println(proc);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        //going towards the vertical side
        if (row<maze.length-1){
            pathRestrictions(proc+'D',maze,row+1,col);
        }
        //going towards the horizontal side
        if(col<maze[0].length-1){
            pathRestrictions(proc+'R',maze,row,col+1);
        }
    }
    // if we can include all the paths (up,down,right left)+back tracking
    static void AllPaths(String proc,boolean[][] maze,int row,int col){
        if(row==maze.length-1 &&col==maze[0].length-1){
            System.out.println(proc);
            return;
        }//checking if the cell is already visited
        if(!maze[row][col]){//checking if the cell is already visited
            return;
        }
        maze[row][col]=false;//marking the current cell as false;visited
        //going towards  down
        if (row<maze.length-1){
            AllPaths(proc+'D',maze,row+1,col);
        }
        //going towards the right
        if(col<maze[0].length-1){
            AllPaths(proc+'R',maze,row,col+1);
        }
        //going towards up
        if(row>0){
            AllPaths(proc+'U',maze,row-1,col);
        }
        //going towards the left
        if(col>0){
            AllPaths(proc+'R',maze,row,col-1);
        }
        /*
        At this point the function call is over ,
        before it is removed from the stack, we will revert the changes back
        */
        maze[row][col]=true;
    }
    //printing actual path in matrix form
    static void AllPathsPrint(String proc,boolean[][] maze,int row,int col,int[][] path,int step){
        if(row==maze.length-1 &&col==maze[0].length-1){
            path[row][col]=step;//last step will also be an additional step
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(proc);
            System.out.println();
            return;
        }//checking if the cell is already visited
        if(!maze[row][col]){//checking if the cell is already visited
            return;
        }
        maze[row][col]=false;//marking the current cell as false;visited
        path[row][col]=step;//marking the step no. in current cell

        //going towards  down
        if (row<maze.length-1){
            AllPathsPrint(proc+'D',maze,row+1,col,path,step+1);
        }
        //going towards the right
        if(col<maze[0].length-1){
            AllPathsPrint(proc+'R',maze,row,col+1,path,step+1);
        }
        //going towards up
        if(row>0){
            AllPathsPrint(proc+'U',maze,row-1,col,path,step+1);
        }
        //going towards the left
        if(col>0){
            AllPathsPrint(proc+'R',maze,row,col-1,path,step+1);
        }
        /*
        At this point the function call is over ,
        before it is removed from the stack, we will revert the changes back
        */
        maze[row][col]=true;
        path[row][col]=0;
    }
}
