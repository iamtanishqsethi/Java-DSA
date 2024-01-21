import java.util.Arrays;
//search in strictly sorted array(both row and column wise sorted)
public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(Arrays.toString(search(arr,1)));
    }
    public static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        //check  added to know if matrix is empty
        if(cols==0){
            return new int[]{-1,-1};
        }
        //check added if the array contains only one row i.e. 1 d array
        if(rows ==1){
            return binarysearch(matrix,0,0,cols-1,target);
        }
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;/*

        we will fix a middle column and will eliminate rows timm we have ony two rows
        This function will perform binary search on the rows of the matrix
        */

        while(rstart<(rend-1)){//run the loop till only 2 rows are remaining
            //the loop will be true till we have more than 2 rows
            int mid = rstart + (rend-rstart)/2;
            if(matrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }if(matrix[mid][cmid]<target){
                rstart=mid;
            }else{
                rend=mid;
            }
        }

        //now we have 2 rows
        //check whether the target is in col of 2 rows
        if(matrix[rstart][cmid]==target){
            return new int[]{rstart,cmid};
        }if(matrix[rstart+1][cmid]==target){
            return new int[]{rstart+1,cmid};
        }
        //if not in the mid-column of the 2 rows
        //search in the four half

        //search in 1st half
        if(matrix[rstart][cmid-1]>=target){
            return binarysearch(matrix,rstart,0,cmid-1,target);
        }
        //search in 2nd half
        if(matrix[rstart][cmid+1]<=target && matrix[rstart][cols-1]>=target){
            return binarysearch(matrix,rstart,cmid+1,cols-1,target);
        }
        //search in 3rd half
        if(matrix[rstart+1][cmid-1]>=target){
           return binarysearch(matrix,rstart+1,0,cmid-1,target);
        }
        //search in 4th half
        else{
            return binarysearch(matrix,rstart+1,cmid+1,cols-1,target);
        }
    }
    public static int[] binarysearch(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid = cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }if(matrix[row][mid]<target){
                cstart=mid+1;
            }if(matrix[row][mid]>target){
                cend=mid-1;
            }
        }return new int[]{-1,-1};
    }
}
