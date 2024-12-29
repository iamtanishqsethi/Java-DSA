import java.util.Arrays;

public class Insertion_sort {
    //we are partially sorting the array
    /*
    adaptive steps , gets reduced with size  of array
    less number of swaps as compared to bubble sort
    works good when array is partially sorted
     */
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Insertion(int[] arr){
        for(int i =1;i<arr.length;i++){
            int j=i;
            while(j>0 && (arr[j-1]>arr[j]) ){
                swap(arr,j,j-1);
                j--;
            }

        }
    }public static void swap(int[] arr,int first,int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
