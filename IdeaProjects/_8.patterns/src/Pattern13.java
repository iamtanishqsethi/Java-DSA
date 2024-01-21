public class Pattern13 {
    /*
         *
        * *
       *   *
      *     *
     *********
     */
    public static void main(String[] args) {
        pattern13(5);
    }public static void pattern13(int n){
        for(int row=1;row<=5;row++){
            for(int space =n-row;space>0;space--){
                System.out.print(" ");
            }for(int col =1;col<(2*row);col++){
                if(col==1||2*row-col==1){
                    System.out.print("*");
                } else if (row==5) {
                    System.out.print("*");
                } else  {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
