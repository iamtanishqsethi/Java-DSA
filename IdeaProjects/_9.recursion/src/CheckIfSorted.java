public class CheckIfSorted {//TO.DO. this solution is not complete , give run time error for large inputs
    boolean arraySortedOrNot(int[] arr, int n) {
        if(n<=1){
            return true;
        }
        if(arr[n-1]==arr[n-2]){
            return arraySortedOrNot(arr,n-1);
        }
        if(!(arr[n-1]>arr[n-2])){
            return false;
        }
        return arraySortedOrNot(arr,n-1);
    }
}
