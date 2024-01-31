public class Bubble_sort {
    //also known as sinking or exchange sort, it is a stable sorting
    /*
    in bubble sort with each pass of i the right side gets sorted , that is
    the largest element is at the last index with each pass, so with the next pass of j
    we will skip the last index as it is already sorted
     */
    public static void bubble(int[] arr){
        //run the steps n-1 times
        for(int i =0;i<arr.length;i++){
            //for each step max item will come at last index
            boolean swapped = false;
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than previous
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }if(!swapped){
                // if no swaps in the nested j loop , break the loop
                break;
            }
        }
    }
}
