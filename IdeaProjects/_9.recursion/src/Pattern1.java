public class Pattern1 {
    /*
    ****
    ***
    **
    *
     */
    public static void main(String[] args) {
        pattern1(4,0);
    }
    static void pattern1(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            pattern1(row,col+1);
        }else{
            System.out.println();
            pattern1(row-1,0);
        }
    }
}
