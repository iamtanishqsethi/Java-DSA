import java.util.Arrays;
//insertion sort using recursion
public class InsertionSortRecursion {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        insertionSort(arr,5);
        System.out.println(Arrays.toString(arr));
    }
   static void insertionSort(int arr[] , int n){
       if(n<=1){
           return;
       }
       insertionSort(arr,n-1);//first sorting the n-1 elements of the array
       int last=arr[n-1];//marking the last element
       int j=n-2;
       while (j>=0&&arr[j]>last){//moving in that chunk from j to 0 and 'changing' them if greater than last
           arr[j+1]=arr[j];
           j--;
       }
       arr[j+1]=last;//replacing the arr[-1+1] with 'last' element
   }
}

