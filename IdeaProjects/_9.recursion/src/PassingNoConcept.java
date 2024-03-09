public class PassingNoConcept {
    public static void main(String[] args) {
        fn(5);
    }
    static void fn(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        //fn(n--)
        /*
        we cannot use n-- here as will lead to stack overflow error
        difference between n-- and --n
        'n--' passes the value first and then subtracts whereas,
        '--n' subtracts the value first and then passes it
        So here we will use --n to avoid infinite recursion
         */
        fn(--n);
    }
}
