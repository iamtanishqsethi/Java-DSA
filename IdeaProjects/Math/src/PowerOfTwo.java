public class PowerOfTwo {
    //can do this bitwise operator?
    public boolean isPowerOfTwo(int n) {
        int ans;
        for (int i=0;i<=30;i++){
            ans = (int)(Math.pow(2,i));
            if(ans==n){
                return true;
            }

        }return false;

    }
}
