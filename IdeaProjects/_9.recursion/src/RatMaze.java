import java.util.ArrayList;
//https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1?page=1&category=Backtracking&sortBy=submissions
public class RatMaze {
    public static void main(String[] args) {
        int[][] mat={{1,1,1},{1,1,1},{1,1,1}};
        System.out.println(findPath(mat));
    }
    public static ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> paths = solveMaze(mat, "", 0, 0);
        // If no paths found, return a list with "-1"
        if (paths.isEmpty()) {
            paths.add("-1");
        }

        return paths;
    }
    private static ArrayList<String> solveMaze(int[][] mat,String proc,int row,int col){
        ArrayList<String> list=new ArrayList<>();
        // Check if the current position is valid
        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length || mat[row][col] == 0 || mat[row][col] == -1) {
            return list; // return an empty list since this path is invalid
        }
        if(row==mat.length-1&&col==mat[0].length-1){
            list.add(proc);
            return list;
        }

        if(mat[row][col]==0||mat[row][col]==-1){
            return list;
        }
        //marked the cell
        mat[row][col]=-1;
        //going down
        if(row<mat.length-1){
            list.addAll(solveMaze(mat,proc+'D',row+1,col));
        }
        //going right
        if(col<mat[0].length-1){
            list.addAll(solveMaze(mat,proc+'R',row,col+1));

        }
        //going up
        if(row>0){
            list.addAll(solveMaze(mat,proc+'U',row-1,col));
        }
        //going left
        if(col>0){
            list.addAll(solveMaze(mat,proc+'L',row,col-1));
        }
        //backtrack
        if (mat[row][col] == -1) {
            mat[row][col] = 1;
        }
        return list;

    }
}
