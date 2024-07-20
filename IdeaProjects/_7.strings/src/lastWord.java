import java.util.Arrays;
//https://leetcode.com/problems/length-of-last-word/
public class lastWord {
    public static void main(String[] args) {
        String str="   fly me   to   the moon  ";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
    }
    public int lengthOfLastWord(String s) {
        int count=0;
        String[] arr=s.split(" ");
        count=arr[arr.length-1].length();
        return count;
    }
}
