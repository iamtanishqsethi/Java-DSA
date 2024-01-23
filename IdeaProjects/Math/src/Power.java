public class Power {
    //To find a power b
    public static void main(String[] args) {
        int base =2;
        int pow =5;
        int ans =1;
        while(pow>0){
            if((pow&1)==1){//not multiplying if the last index is zero
                ans*=base;
            }
            base*=base;
            pow=pow>>1;
        }
        System.out.println(ans);
    }
}
