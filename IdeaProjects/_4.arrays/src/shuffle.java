import java.util.Arrays;

public class shuffle {
    //array is initially {x1,x2,x3,y1,y2,y3} shuffled array is {x1,y1,x2,y2,x3,y3}
    public static int[] shuffle(int[] nums,int n ){
        int[] list = new int[nums.length];
        list[0]=nums[0];
        for(int i=0;i<n;i++){
            list[i * 2] = nums[i];
            list[i * 2 + 1] = nums[i + n];
        }return list;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n= 3;
        String array = Arrays.toString(shuffle(nums,n));
        System.out.println(array);
    }
}
