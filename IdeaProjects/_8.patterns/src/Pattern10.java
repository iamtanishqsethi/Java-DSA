public class Pattern10 {
    /*
         *
        * *
       * * *
      * * * *
     * * * * *
     */
    public static void main(String[] args) {
        pattern10(5);
    }public static void pattern10(int n){
        for(int row =1;row<=n;row++){
            for(int space =n-row;space>=0;space--){
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
