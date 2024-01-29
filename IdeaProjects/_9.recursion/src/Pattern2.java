public class Pattern2 {
    /*
    *
    * *
    * * *
    * * * *
     */
    public static void main(String[] args) {
        pattern(4,0);
    }
    static void pattern(int row,int col){
        if(row==0){
            return;
        }
        else{
            if(col<row){
                pattern(row,col+1);
                System.out.print("* ");
            }else{
                pattern(row-1,0);
                System.out.println();
            }
        }
    }
}
