public class Pattern6 {
    /*
         *
        **
       ***
      ****
     *****

     */
    public static void main(String[] args) {
        pattern6(5);
    }
    public static void pattern6(int n){
        for(int row=1;row<=n;row++){
            for(int noofspaces = n-row;noofspaces>=0;noofspaces--){
                System.out.print(" ");
            }
            for(int col =1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
