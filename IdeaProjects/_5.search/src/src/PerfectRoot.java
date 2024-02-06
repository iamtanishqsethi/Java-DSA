public class PerfectRoot {
    //https://leetcode.com/problems/valid-perfect-square/
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(0));
    }
    public static boolean isPerfectSquare(int num) {
        if(num==0){
            return true;
        }
        int start =1;
        int end = num;
        while(start<=end){
            long mid = start+(end-start)/2;//used long for values out of range of integer
            if(mid*mid==num){
                return true;
            }if(mid*mid<num){
                start= (int) (mid+1);
            }else{
                end=(int)(mid-1);
            }
        }return false;
    }
}
