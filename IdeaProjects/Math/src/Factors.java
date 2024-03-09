public class Factors {
    public static void main(String[] args) {
        factors2(20);
    }
    static void factors1(int n){//O(n)
        for(int i =1;i<=n;i++){
            if(n%i==0) {
                System.out.print(i + " ");
            }
        }
    }
    static void factors2(int n){//O(square root n)
        for(int i =1;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                if(i==n/i){
                    System.out.print(i+" ");//if both n/i and i are same
                }
                else{
                    System.out.print(i + " "+ n/i+ " ");//one factor is i and other factor is n/i
                }
            }
        }/*
        the function factors2 prints the factors in unsorted way but with the pattern
        i factors are in ascending and n/i are in descending so,
         we can add them is an ArrayList and print them  one by one
        */

    }
}
