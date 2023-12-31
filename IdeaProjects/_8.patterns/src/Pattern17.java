public class Pattern17 {
    /*
         1
        212
       32123
      4321234
       32123
        212
         1
     */
    public static void main(String[] args) {
        pattern17(5);
    }
    public static void pattern17(int n) {
        for(int row = 1;row<2*n;row++){
            int totalcolsinrows=row>n ? 2*n - row: row;
            int noofspaces = n-totalcolsinrows;
            for (int s=0;s<noofspaces;s++) {
                System.out.print("  ");
            }
            for(int col=totalcolsinrows;col>=1;col--){
                System.out.print(col+" ");
            }for (int col = 2;col<=totalcolsinrows;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

}
