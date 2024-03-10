//https://leetcode.com/problems/majority-element/
//
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums= {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
            return helper(nums,0,nums[0]);
    }
    public static int helper(int[] arr,int start,int ele){
        int count =0;
        for(int i = start;i<arr.length;i++){
            if(arr[i]==ele){count ++;}
            else{count--;}
            if(count==-1){
                return helper(arr,i,arr[i]);
            }
        }return ele;
    }
}

