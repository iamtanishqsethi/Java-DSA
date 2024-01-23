public class BinarySqrt {
    //to get precise square root of a number using binary search
    public static void main(String[] args) {
        int n =40;
        int pres =3;
        System.out.printf("%.3f", sqrt(n,pres));
    }static double sqrt(int n,int p){
        int s=0;
        int e =n;
        double root=0.0;
        //for perfect root
        while(s<=e){
            int mid =s+(e-s)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid>n){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        //for precision
        double increment =0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=increment;
            }
            root-=increment;
            increment/=10;
        }
        return root;
    }
}
