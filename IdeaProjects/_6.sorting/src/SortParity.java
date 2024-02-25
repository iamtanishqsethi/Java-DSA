import java.util.Arrays;

public class SortParity {
    public static void main(String[] args) {
        int[] nums = {1,0,3};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
        public static int[] sortArrayByParity(int[] nums) {
            int start = 0;
            int end = nums.length-1;
            while(start<=end) {
                if (nums[start]%2!=0 && nums[end]%2==0) {
                    swap(nums, start, end);
                    start++;
                    end--;
                } else {
                    if (nums[start] % 2 == 0) {
                        start++;
                    }
                    if (nums[end] % 2 != 0) {
                        end--;
                    }
                }
            }
            return nums;
        }
        public static void swap(int[] arr,int first,int last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
}
