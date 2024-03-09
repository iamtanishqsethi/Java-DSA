import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr  = {5,4,3,2,1};
        //arr= mergesort(arr);
        mergesortInPlace(arr,0, arr.length-1);
        System.out.println(Arrays.toString(mergesort(arr)));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        /*Arrays.copyOfRange will create a copy of the original array for specified range.
        It is actually creating new objects , rather than updating the original array
         */
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int[] mix = new int[first.length + second.length];
        int i =0;
        int j =0;
        int k =0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }k++;
        }
        //May be possible one of the array got over first; then add all the elements from the other array
        //if elements are left in first, add remaining elements
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        //if elements are left in second ,add remaining elements
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }


    static void mergesortInPlace(int[] arr, int start, int end ){
        if(end+1-start==1){
            return;
        }
        int mid = (start+end)/2;

        mergesortInPlace(arr,start,mid);
        mergesortInPlace(arr,mid+1,end);
        mergeInPlace(arr,start,mid,end);
    }
    static void mergeInPlace(int[] arr,int start, int mid, int end){
        int[] mix = new int[end-start];
        int i =start;
        int j =mid;
        int k =0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }k++;
        }

        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }

        while(j<end){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l =0;l<mix.length;l++){
            arr[start+l]=mix[l];
        }
    }
}
