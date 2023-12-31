public class Pattern31 {
    /*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
     */
    //the value of each element is equal to original N -the minimum distance from each wall
    public static void main(String[] args) {
        pattern30(4);
    }
    public static void pattern30(int n ){
        int originalN = n;
        n = 2*n;
        for(int row =0;row<=n;row++){
            for (int col=0;col<=n;col++){
                int atEveryIndex = originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
