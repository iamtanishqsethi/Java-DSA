public class Pattern21 {//
    /*
       1
       2  3
       4  5  6
       7  8  9  10
       11 12 13 14 15
     */
    public static void main(String[] args) {
        pattern21(5);
    }
    public static void pattern21(int n){
        int x =1;
        int col;
        for(int row=1;row<=n;row++){
            for(col=1;col<=row;col++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
