public class PowerOfNum {
    //https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1?page=1&category=Recursion,Backtracking&sortBy=submissions
    static final int MOD=1000000007;//condition from question to make answer shorter
    long power(int N,int R) {
        if(R==0){
            return 1;
        }
        //doing in O(logR) complexity
        //calculating half power
        long halfPower=power(N,R/2);
        halfPower=(halfPower*halfPower)%MOD;

        if(R%2!=0) {
            halfPower=(halfPower*N)%MOD;
        }
        return halfPower;

    }
}
