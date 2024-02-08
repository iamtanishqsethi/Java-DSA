public class NeedleHaystack {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode","leeto"));
    }
    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            for(int i=0;i<haystack.length();i++){
                if((haystack.substring(i)).startsWith(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
