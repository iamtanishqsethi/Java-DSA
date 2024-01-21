public class Pattern12 {
    /*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
     */
    public static void main(String[] args) {
        pattern12(5);
    }public static void pattern12(int n){
        for(int row=1;row<=2*n;row++){
            if(row>n){
                int colinrow=row-n;
                for(int space =n-colinrow;space>=0;space--){
                    System.out.print(" ");
                }
                for(int col =1;col<=colinrow;col++){
                    System.out.print("* ");
                }
            }else{
                for(int space=0;space<row;space++){
                    System.out.print(" ");
                }for(int col =n;col>row-1;col--){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
