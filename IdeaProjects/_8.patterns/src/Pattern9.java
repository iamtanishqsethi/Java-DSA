public class Pattern9 {
    /*
     *********
      *******
       *****
        ***
         *
     */
    public static void main(String[] args) {
        pattern9(5);
    }public static void pattern9(int n){
        for(int row =1;row<=n;row++){
            for(int space =0;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col =2*row -1;col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
