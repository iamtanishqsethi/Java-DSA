public class Pattern8 {
    /*
         *
        ***
       *****
      *******
     *********
     */
    public static void main(String[] args) {
        pattern8(5);
    }public static void pattern8(int n){
        for(int row =1;row<=n;row++){
            for(int space =n-row;space>=0;space--){
                System.out.print(" ");
            }
            for(int col =1;col<2*row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
