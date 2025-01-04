import java.util.HashMap;

public class UniqueNoThree {//
    //we have an array and each no appears 3 times except one no
    //we cannot directly use xor operation as wit will result in wrong answer
    /*
    we keep track of no that appears once and twice
    if a no has appeared and has also appeared twice before we remove it and vice versa

    * */
    //https://leetcode.com/problems/single-number-ii/
    public static void main(String[] args) {
        int[] arr={2,2,3,2};
        System.out.println(uniqueNo(arr));

    }
    private static  int uniqueNo(int[] arr){
        int once=0;
        int twice=0;
        for(int n:arr){
            once=(once^n) & (~twice);
            twice=(twice^n) & (~once);
        }
        return once;
    }
    //another way by using another data structure to store values of count
    public static int singleNo(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }

}
