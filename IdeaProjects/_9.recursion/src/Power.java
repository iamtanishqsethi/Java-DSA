public class Power {
    //https://leetcode.com/problems/powx-n/
    //in this question we need to handle negative powers also
    public double myPow(double x, int n) {
        if (n == 0)  return 1.0;
        if (n < 0) return helper(1 / x, -n);
        return helper(x, n);
    }

    private double helper(double x, int n) {
        if (n == 0) return 1.0;
        double half = helper(x, n / 2);
        if (n % 2 == 0) {  //n even
            return half * half;
        } else {  // n  odd
            return half * half * x;
        }
    }
    //optimized approach O(logN)
    // check the notes section of this question on leetcode
}
