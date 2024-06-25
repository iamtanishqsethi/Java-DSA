package Questions;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class NextGreater {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int index=search(nums2,nums1[i]);
            int greater=-1;
            for(int j=index;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    greater=nums2[j];
                    break;
                }
            }ans[i]=greater;

        }
        return ans;
    }

    private static int search(int[] nums2, int x) {
        for (int i = 0; i < nums2.length; i++) {
            if(nums2[i]==x) {
                return i;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int[]nums1={4,2,1};
        int[]nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }

}
