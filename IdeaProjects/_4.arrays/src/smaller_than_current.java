import java.util.Arrays;
//to print the numbers smaller than current in whole array
public class smaller_than_current {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] list = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int x =0;
            for(int j =0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    x++;
                }
            }list[i]=x;
        }return list;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        String array = Arrays.toString(smallerNumbersThanCurrent(nums));
        System.out.println(array);
    }
}
