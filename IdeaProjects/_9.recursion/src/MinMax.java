import java.util.Arrays;
//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(ArrMin(arr,arr[0]));
        System.out.println(ArrMax(arr,arr[0]));
    }
    static int ArrMin(int[] arr,int min){//to get min value
        if(arr.length<1){
            return min;
        }
        min= Math.min(min,arr[0]);
        return ArrMin(Arrays.copyOfRange(arr,1,arr.length),min);
    }
    static int ArrMax(int[] arr,int max){//to get max value
        if(arr.length<1){
            return max;
        }
        max= Math.max(max,arr[0]);
        return ArrMax(Arrays.copyOfRange(arr,1,arr.length),max);
    }

}
