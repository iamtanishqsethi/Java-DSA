public class twoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int start=0;
        int end = numbers.length-1;
        while(start<end){
            if(target==numbers[start]+numbers[end]){
                ans[0]=start+1;
                ans[1]=end+1;
                return ans;
            } else if (target>numbers[start]+numbers[end]) {
                start++;
            } else if (target<numbers[start]+numbers[end]) {
                end--;
            }
        }
        return null;

    }
}
