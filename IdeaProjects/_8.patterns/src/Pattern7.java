public class Pattern7 {
    /*
     *****
      ****
       ***
        **
         *
     */
    public static void main(String[] args) {
        pattern7(5);
    }
    public static void pattern7(int n){
        for(int row=1;row<=n;row++){
            for(int noofspaces = 0;noofspaces<row;noofspaces++){
                System.out.print(" ");
            }
            for(int col =n-row;col>=0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
