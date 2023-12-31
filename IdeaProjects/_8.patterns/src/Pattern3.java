public class Pattern3 {
    /*
     *****
     ****
     ***
     **
     *
     */
    public static void main(String[] args) {
        for(int row =0;row<=5;row++){
            for(int col =5-row;col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
