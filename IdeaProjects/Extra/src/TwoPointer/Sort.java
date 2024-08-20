package TwoPointer;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int swaps=bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(swaps);
    }
    public static int bubbleSort(int[] arr){
        int swaps=0;
        for(int i =0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++) {
                if (arr[j] < arr[j - 1]) {
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }
            }

        }return swaps;
    }
}
