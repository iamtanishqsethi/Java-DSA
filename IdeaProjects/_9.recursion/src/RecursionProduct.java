public class RecursionProduct {
    public static void main(String[] args) {
        System.out.println(product(2,5));
    }
    static int product(int a,int b){//to find product of two numbers using recursion
        if(a>b){
            product(b,a);//to make more efficient
        }
        if(b==0){
            return 0;
        }
        return a + product(a,b-1);
    }
}
