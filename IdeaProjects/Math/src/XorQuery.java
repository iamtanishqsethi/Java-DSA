public class XorQuery {
    //https://leetcode.com/problems/xor-queries-of-a-subarray/
    //TODO:TLE for large inputs : testcase 45/46 , fix issue
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] ans= new int[queries.length];
        for(int i=0;i< ans.length;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            for(int j=start;j<=end;j++){
                ans[i]^=arr[j];
            }
        }
        return ans;
    }
}
