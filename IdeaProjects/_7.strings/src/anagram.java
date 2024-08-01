import java.util.Arrays;
//https://leetcode.com/problems/valid-anagram/
public class anagram {
    public boolean isAnagram(String s, String t) {
        char[] sArr=s.toCharArray();
        Arrays.sort(sArr);
        String newS = new String(sArr);
        char[] tArr=t.toCharArray();
        Arrays.sort(tArr);
        String newT= new String(tArr);
        return newS.equals(newT);

    }
}
