public class ProductArray {
    //following sol in O(n^2 ) so gives TLE
//    public int[] productExceptSelf(int[] nums) {
//        int[] ans= new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            ans[i]=product(nums,0,i-1)*product(nums,i+1,nums.length-1);
//        }
//        return ans;
//    }
//    private int product(int[] arr,int start,int end){
//        int pro=1;
//        for (int i = start; i <=end ; i++) {
//            pro*=arr[i];
//        }
//        return pro;
//    }

//https://leetcode.com/problems/product-of-array-except-self/
    //Help taken :store the product of the elements before and after that element in an array
    //TODO:reattempt it later
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int[] prefixProduct=new int[nums.length];
        int[] suffixProduct=new int[nums.length];
        prefixProduct[0]=1;
        suffixProduct[nums.length-1]=1;
        //calculating prefix product for each element
        for (int i = 1; i < nums.length; i++) {
            prefixProduct[i]=prefixProduct[i-1]*nums[i-1];
        }
        //calculating suffix product for each element
        for (int i = nums.length-2; i >=0; i--) {
            suffixProduct[i]=suffixProduct[i+1]*nums[i+1];
        }
        //now multiplying both in final arr
        for (int i = 0; i < ans.length; i++) {
            ans[i]=prefixProduct[i]*suffixProduct[i];
        }
        return ans;

    }
}
