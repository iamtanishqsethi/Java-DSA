public class Pattern30 {
    /*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
     */
    public static void main(String[] args) {
        pattern30(5);
    }
    public static void pattern30(int n) {
        for(int row =1;row<=n;row++){
            for (int s=0;s<n-row;s++){
                System.out.print("  ");
            }
            //first it is running from row no to 1
            for(int col =row;col>=1;col--){
                System.out.print(col+" ");
            }//then it is running from 1 to row number
            for(int col =2;col<=row;col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
