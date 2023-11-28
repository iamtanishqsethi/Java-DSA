public class evenNoDigit {
    //to return the no. of values that have even number of digits
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(digits(nums[i]))){
                count++;
            }
        }return count;
    }
    public static boolean even(int count){
        if(count%2==0){
            return true;
        }return false;
    }
    public static int digits(int x){
        int count=0;
        int temp=x;
        while(temp!=0){
            temp=temp/10;
            count++;
        }return count;
    }
}
