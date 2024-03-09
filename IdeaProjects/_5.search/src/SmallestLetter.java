public class SmallestLetter {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters,target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        if(target>=letters[letters.length-1]){
            return letters[0];
        }
        int start =0;
        int end =letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>=letters[mid]){
                start  =mid+1;
            }else{
                end = mid-1;
            }
        }return letters[start];
    }
}
