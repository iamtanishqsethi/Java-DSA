public class Pattern5 {
    /*
     *
     **
     ***
     ****
     *****
     ****
     ***
     **
     *
     */
    public static void main(String[] args) {
        pattern5(5);
    }
    public static void pattern5(int n) {
        for(int row =0;row<(2*n);row++){
            /*
            to check if the no of rows are more than n ,
            if true col will go from 0 to the difference of 2n and rows
            else print normally
             */
            int totalcolsinrows=row>n ? 2*n - row: row;
            for(int col =0;col<totalcolsinrows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
