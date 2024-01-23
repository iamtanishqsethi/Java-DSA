public class MagicNo {
    /*
    The magic number series is -(amazon)
    1->5
    2->25
    3->30
    4->125
    5->135
    6->?
    find the 6th magic number
     */
    public static void main(String[] args) {
       int n=6;
       int base =5;
       int ans=0;
       while(n>0){
           int last =n&1;//getting the last digit as in binary form
           ans+=base*last;
           //traversing through the binary form of that number using right shift
           n=n>>1;
           //increasing the power of the base as we move to higher units
           base=base*5;
       }
        System.out.println(ans);
    }
}
