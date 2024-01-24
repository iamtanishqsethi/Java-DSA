public class NewtonRaphsonMethod {
    //square root by newton raphson method
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        double x =n;
        double root;
        while(true){
            root  = 0.5*(x + (n/x));
            if(Math.abs(root-x)<1){//we can change the precision value from 1 to any number
                break;
            }
            x=root;
        }return root;
    }
}
