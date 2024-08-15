public class CountNegatives {
    //https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

    //O(n*m) very bad but acceptable
//    public int countNegatives(int[][] grid) {
//        int count=0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if(grid[i][j]<0) count++;
//            }
//        }
//        return count;
//    }
    //how to optimize it ?(took help)
    //TODO:think about binary search , since array is sorted
    //O(m+n)
    public int countNegatives(int[][] grid){
        //since array is sorted in decreasing order, so we check from the last of first row
        //if last element of the first r0w is positive we move down
        //else we update the count by number of rows - i since its sorted
        int count=0;
        int n= grid.length;
        if(n==0) return count;
        int m= grid[0].length;
        int i=0;
        int j=m-1;
        while(i<n&&j>=0){
            if(grid[i][j]>=0){
                i++;
            }
            else{
                count+=(n-i);
                j--;
            }
        }
        return count;
    }
}
