public class xorOperationArray {
    //https://leetcode.com/problems/xor-operation-in-an-array/description/
    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
    }
    public static int xorOperation(int n, int start) {
        int[] nums=new int[n];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            nums[i]=start+2*i;
            ans^=nums[i];
        }
        return ans;
    }
}
