public class SortedArray {
    //to check if the array is sorted using recursion
    public static void main(String[] args) {
        int[] arr ={1,2,3,9,6,8};
        System.out.println(ifsorted(arr,0));
    }
    static boolean ifsorted(int[]arr,int index){
        if(index== arr.length-1){
            //if index reaches to last element ie one element left in array
            return true;
        }
        return arr[index]<arr[index+1]&&ifsorted(arr,index+1);
    }
}
