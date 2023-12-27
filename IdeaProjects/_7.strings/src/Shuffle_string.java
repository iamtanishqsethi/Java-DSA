import java.util.Arrays;
//https://leetcode.com/problems/shuffle-string/description/

public class Shuffle_string {
    public static void main(String[] args) {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString("codeleet", indices));
    }
    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[indices.length];
        for(int i =0;i< arr.length;i++){
            char ch = s.charAt(i);
            arr[indices[i]]=ch;
        }
        String x = String.valueOf(arr);//converts an array of characters to string
        return x;
    }
}
