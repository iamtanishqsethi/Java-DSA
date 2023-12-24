public class Cycle_sort {
    /*
    IMPORTANT
    used when the array is of the form 1-N ,O(n) complexity
     */
    public static void cycle(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }public static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
