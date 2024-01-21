public class Pattern16 {///
    /*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
     */
    public static void main(String[] args) {
        pattern16(5);
    }public static void pattern16(int n){
        for(int row=0;row<n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }for(int col=0;col<=row;col++){
                System.out.print(" "+binomialcoeff(row,col));
            }
            System.out.println();
        }
    }
    public static int binomialcoeff(int n,int k){
        return factorial(n)/(factorial(k)*factorial(n-k));//formula for binomial coefficient
    }public static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
