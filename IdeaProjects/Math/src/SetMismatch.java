import java.util.Arrays;//
//https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }
    //very bad time complexity
    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];

        int dup=-1,missing=-1;
        for(int i =1;i<=nums.length;i++){
            int count =0;
            for(int j =0;j< nums.length;j++){
                if(nums[j]==i){
                    count++;
                }
            }
            if(count==2){dup=i;}
            else if (count==0) {
                missing=i;
            }
        }
        arr[0]=dup;
        arr[1]=missing;
        return arr;
    }
}
