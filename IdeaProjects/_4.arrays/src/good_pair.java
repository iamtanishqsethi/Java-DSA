public class good_pair {
    //good pair are those if elements i and j of array are equal and i<j
    public static int goodPairs(int[] nums){
        int x = 0;
        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    x++;
                }
            }
        }return x;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(goodPairs(nums));
    }
}
