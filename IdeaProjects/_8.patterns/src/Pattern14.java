public class Pattern14 {//incomplete
    /*
     *********
      *     *
       *   *
        * *
         *
     */
    public static void main(String[] args) {
        pattern14(5);
    }public static void pattern14(int n){
        for(int row =0;row<n;row++){
            for(int space =0;space<=row;space++){
                System.out.print(" ");
            }for(int col =2*n-1-row;col>=0;col--){
                if(row==0){
                    System.out.print("*");
                } else if (col==2*n-1-row||col==1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
