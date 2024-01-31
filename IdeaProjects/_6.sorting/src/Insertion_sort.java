public class Insertion_sort {
    //we are partially sorting the array
    /*
    adaptive steps , gets reduced with size  of array
    less number of swaps as compared to bubble sort
    works good when array is partially sorted
     */
    public static void Insertion(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }public static void swap(int[] arr,int first,int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
