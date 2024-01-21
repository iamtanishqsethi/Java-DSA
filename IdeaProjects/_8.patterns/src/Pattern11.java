public class Pattern11 {
    /*
     * * * * *
      * * * *
       * * *
        * *
         *
     */
    public static void main(String[] args) {
        pattern11(5);
    }public static void pattern11(int n){
        for(int row =1;row<=n;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }for(int col =n;col>row-1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
