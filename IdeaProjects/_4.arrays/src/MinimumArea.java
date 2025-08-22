public class MinimumArea {
    //https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/?envType=daily-question&envId=2025-08-22
    public static void main(String[] args) {
        int[][] grid={{0,1,0},{1,0,1}};
        System.out.println(minimumArea(grid));
    }
//    public static int minimumArea(int[][] grid) {
//        int topRow = 0;
//        int bottomRow = 0;
//        int leftCol = 0;
//        int rightCol = 0;
//
//        boolean found = false;
//
//        for (int row = 0; row < grid.length; row++) {
//            for (int col = 0; col < grid[row].length; col++) {
//                if (grid[row][col] == 1) {
//                    topRow = row;
//                    found = true;
//                    break;
//                }
//            }
//            if (found) break;
//        }
//
//        found = false;
//        for (int row = grid.length - 1; row >= 0; row--) {
//            for (int col = grid[row].length - 1; col >= 0; col--) {
//                if (grid[row][col] == 1) {
//                    bottomRow = row;
//                    found = true;
//                    break;
//                }
//            }
//            if (found) break;
//        }
//
//        found = false;
//        for (int col = 0; col < grid[0].length; col++) {
//            for (int row = 0; row < grid.length; row++) {
//                if (grid[row][col] == 1) {
//                    leftCol = col;
//                    found = true;
//                    break;
//                }
//            }
//            if (found) break;
//        }
//
//        found = false;
//        for (int col = grid[0].length - 1; col >= 0; col--) {
//            for (int row = grid.length - 1; row >= 0; row--) {
//                if (grid[row][col] == 1) {
//                    rightCol = col;
//                    found = true;
//                    break;
//                }
//            }
//            if (found) break;
//        }
//
//        System.out.println(topRow + " " + bottomRow + " " + leftCol + " " + rightCol);
//        return (bottomRow - topRow + 1) * (rightCol - leftCol + 1);
//    }

    //more optimized in single pass

    public static int minimumArea(int[][] grid) {
        int topRow = Integer.MAX_VALUE;
        int bottomRow = Integer.MIN_VALUE;
        int leftCol = Integer.MAX_VALUE;
        int rightCol = Integer.MIN_VALUE;

        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                if(grid[row][col]==1){
                    topRow=Math.min(topRow,row);
                    bottomRow=Math.max(bottomRow,row);
                    leftCol=Math.min(leftCol,col);
                    rightCol=Math.max(rightCol,col);
                }
            }

        }
        //if No 1 found
        if(topRow==Integer.MAX_VALUE){
            return 0;
        }
        return (bottomRow-topRow+1)*(rightCol-leftCol+1);
    }

}
