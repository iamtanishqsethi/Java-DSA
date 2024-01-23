public class UniqueNo {
    //https://leetcode.com/problems/single-number/description/
    public static void main(String[] args) {
        //find the unique number in the array
        int[] arr ={2,3,4,3,6,2,4};
        System.out.println(ans(arr));
    }public static int ans(int[] arr){
        int unique =0;
        for(int n:arr){
            unique^=n;//XOR every element with each other
        }return unique;
    }
}
