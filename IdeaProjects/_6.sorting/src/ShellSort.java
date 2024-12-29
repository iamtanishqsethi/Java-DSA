import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] ={5,4,3,2,1};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void shellSort(int[] arr){
        for(int gap=arr.length/2;gap>=1;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int j=i;
                while(j>=gap && arr[j]<arr[j-gap]){
                    int temp=arr[j];
                    arr[j]=arr[j-gap];
                    arr[j-gap]=temp;
                    j-=gap;
                }
            }
        }
    }
}
