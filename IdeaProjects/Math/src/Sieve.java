public class Sieve {
    //Sieve of Erantosthemes
    public static void main(String[] args) {
        int n =40;
        boolean[] primes = new boolean[n+1];
        SOE(n,primes);
        //initially for all numbers the value is false i.e. all are prime
    }static void SOE(int n,boolean[] primes){
        for(int i =2;i*i<=n;i++){
            if(!primes[i]){//false in array means number is prime
                for(int j =i*2;j<=n;j+=i){//converting every multiple of prime no to true
                    primes[j]=true;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}
