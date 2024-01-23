public class XOR_0toa {
    public static void main(String[] args) {
        int a =6;
        System.out.println(xor(a));
    }
    /*
    we can run loop for each number and xor
    but will give very bad time complexity
     */
    public static int xor(int n) {
        //values seen from pattern
        if (n % 4 == 0) {
            return n;
        }
        if (n % 4 == 1) {
            return 1;
        }
        if (n % 4 == 2) {
            return n + 1;
        }
        return 0;
    }
}
