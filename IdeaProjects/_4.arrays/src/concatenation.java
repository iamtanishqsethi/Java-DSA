import java.util.Arrays;
//to return the concatenation of array
public class concatenation {
    public static int[] getConcatenation(int[] nums){
        int[] list = new int[2*(nums.length)];
        for(int i = 0;i<nums.length;i++){
            list[i]=nums[i];
            list[i+nums.length]=nums[i];
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        String array = Arrays.toString(getConcatenation(nums));
        System.out.println(array);
    }
}
