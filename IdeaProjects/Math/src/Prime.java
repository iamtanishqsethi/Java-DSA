public class Prime {
    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
            System.out.println(i + " " + isprime(i));
        }
    }
    public static boolean isprime(int n){
        int c =2;
        if(n<=1){ return false;}
        while(c*c<=n){
            if(n%c==0){return false;}
            c++;
        }return true;
    }
}
