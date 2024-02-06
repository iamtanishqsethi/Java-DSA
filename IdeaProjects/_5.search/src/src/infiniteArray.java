public class infiniteArray {
  /*
to search in an infinite array , the only condition is we don't know the size of array
So we can't use arr.length, to overcome that we move in chunks and
 as we move forward we double the size of the chunk
 */
  public static int search(int[] arr,int target) {
      int start = 0;
      int end = 1;
      while(target>arr[end]){
          int temp=end+1;
          end=end+(end-start+1)*2;//doubling the size of chunk as we move forward
          start=temp;
      }
      while (start <= end) {
          int mid = start + (end - start) / 2;
          if (target == arr[mid]) {
              return mid;
          } else if (target > arr[mid]) {
              start = mid + 1;
          } else {
              end = mid - 1;
          }
      }return -1;
  }


    public static void main(String[] args) {
        int[] arr ={5,6,7,8,9,10};
        int target = 10;
        System.out.println(search(arr,target));
    }
}
