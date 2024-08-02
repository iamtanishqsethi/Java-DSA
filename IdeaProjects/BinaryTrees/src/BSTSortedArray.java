import java.util.Arrays;
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class BSTSortedArray {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }

        int mid=(nums.length)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
        return root;
    }
}
