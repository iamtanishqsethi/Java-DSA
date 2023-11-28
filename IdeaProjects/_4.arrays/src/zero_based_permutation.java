import java.util.Arrays;
//to build an array on zero based permutation
public class zero_based_permutation {
    public static int[] buildArray(int[] nums){
        int[] list = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            list[i]=nums[nums[i]];
        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums ={0,2,1,5,3,4};
        String array= Arrays.toString(buildArray(nums));
        System.out.println(array);
    }
}