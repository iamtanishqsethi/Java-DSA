public class PowerOf2 {
    //to check if the number is power of 2 or not
    public static void main(String[] args) {
        int n  =512;
        if(n==0){//special case
            System.out.println(false);
        }
        else{
            boolean ans = (n&(n-1))==0;
            System.out.println(ans);
        }
    }
}
