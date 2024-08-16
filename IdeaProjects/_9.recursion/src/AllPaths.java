import java.util.ArrayList;

public class AllPaths {
    public static ArrayList<ArrayList<Integer>> findAllPossiblePaths(int n, int m, int[][] grid) {
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        helper(ans,n,m,grid,new ArrayList<>(),0,0);
        return ans;
    }
    private static void helper(ArrayList<ArrayList<Integer>> ans,int n,int m,int[][] grid,ArrayList<Integer> current,int i,int j){
        //add the current index to current path list
        current.add(grid[i][j]);

        if(i==n-1&&j==m-1){
            ans.add(new ArrayList<>(current));
        }
        else {
            if(i<n-1){
                helper(ans,n,m,grid,current,i+1,j);
            }
            if(j<m-1){
                helper(ans,n,m,grid,current,i,j+1);
            }
        }
        //backtrack
        current.remove(current.size()-1);

    }
}
