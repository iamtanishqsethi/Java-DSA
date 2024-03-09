public class GP {
    //to print the geometrical progression 
    public static void main(String[] args) {
        gp(10,3,5);
    }
    static void gp(int a,int r,int n){
        if(n<0){
            return;
        }
        gp(a,r,n-1);
        System.out.print(a*(int)Math.pow(r,n) + " ");
    }
}
