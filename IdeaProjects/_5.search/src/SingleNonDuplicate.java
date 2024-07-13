public class SingleNonDuplicate {
    //https://leetcode.com/problems/single-element-in-a-sorted-array/
    public int singleNonDuplicate(int[] nums) {
        int single=0;
        for(int  n:nums){
            single^=n;
        }
        return single;
    }
    /*code works using xor operation in O(n)
    * but we need to use O(logN) as per given condition ?*/

    //TODO:find algorithm that uses binary search approach and reattempt

}
