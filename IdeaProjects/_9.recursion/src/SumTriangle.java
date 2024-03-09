import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        //https://www.geeksforgeeks.org/sum-triangle-from-array/
        int[] arr = {1,2,3,4,5};
        triangleSum(arr);
    }
    static void triangleSum(int[] arr){
        if(arr.length<1){//base case if array is empty
            return;
        }
        int[] temp= new int[arr.length-1];//creating new array every time to hold the sum
        for (int i = 0; i < arr.length-1; i++) {
            temp[i]=arr[i]+arr[i+1];
        }
        triangleSum(temp);
        System.out.println(Arrays.toString(arr));//will be printed after returning
    }
}
