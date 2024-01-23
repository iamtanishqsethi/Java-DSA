public class Setbits {
    public static void main(String[] args) {
        int n= 42;
        System.out.println(Integer.toBinaryString(n));
        setbits2(n);
    }public static void setbits(int n){
        int count =0;
        while(n>0){
            if((n&1)==1){
                count++;
            }n=n>>1;
        }
        System.out.println(count);
    }
    public static void setbits2(int n){
        int count =0;
        while(n>0){
            count++;
            n=n&n-1;
        }System.out.println(count);
    }
}
