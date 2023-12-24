public class Selection_sort {
    // in selection sort we select an element and we put it at its right place
    /*
    we take the largest element in each pass and then swap it with the n-1 index (if range is 1-n)
    or we can do the same with min value.
    we each pass we decrease the last by arr.length-1-i and get the max from the particular chunk of the array.
    Performs well when array is of small size
     */
    public static void selection(int[] arr){
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxInd = getmax(arr,0,last);
            swap(arr,maxInd,last);
        }
    }public static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }public static int getmax(int[] arr, int start,int last){
        int max = start;
        for(int i= start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }return max;
    }
}
