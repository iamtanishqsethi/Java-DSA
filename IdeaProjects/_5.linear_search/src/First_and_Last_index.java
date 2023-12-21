import java.util.Arrays;
//facebook question(leet code medium)
public class First_and_Last_index {
    public static int search (int[] nums,int target,boolean findfirstindex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]) {
                start=mid+1;
            }else{
                ans=mid;
                if(findfirstindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }return ans;
    }public static int[] searchrange(int[] nums,int target){
        int[] ans ={-1,-1};//return {-1,-1} if element not found
        ans[0]=search(nums,target,true);
        ans[1]=search(nums,target,false);
        return ans;
    }

    public static void main(String[] args) {
        int [] arr ={5,7,7,7,7,8,8,10};
        int target = 4;
        System.out.println(Arrays.toString(searchrange(arr,target) ));
    }

}
