import java.util.Arrays;

public class AssignCookies {
    //https://leetcode.com/problems/assign-cookies/
    //same question
    //https://leetcode.com/problems/maximum-matching-of-players-with-trainers

    /*
    * So the greedy algorithm works when we skip the larger size cookies
    * for the children with larger greed than others
    *
    * 1. We sort the greed and size arrays
    * 2. We take a left and right pointer
    * 3. Left pointer for size array and right pointer for greed array
    * 4. We start from the size array and try to assign cookies to the children
    * 5. If the particular cookie satisfies the child we move to next child else
    * 6. in any case we have to move the right pointer as if that cookie was not able to satisfy the previous child
    * it wont we able to satisfy the other children after it as they would have larger greed factor
    * 7. At the end we return the index of right pointer as that is the number of children we were able to satisfy
    *
    * */

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int left=0;
        int right=0;
        while(left<s.length && right<g.length){
            if(g[right]<=s[left]){
                right++;
            }
            left++;
        }

        return right;
    }
}
