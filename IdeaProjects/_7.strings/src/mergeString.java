public class mergeString {
//https://leetcode.com/problems/merge-strings-alternately/
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        while(!word1.isEmpty()&&!word2.isEmpty()){
            sb.append(word1.charAt(0));
            sb.append(word2.charAt(0));
            word1=word1.substring(1);
            word2=word2.substring(1);
        }
        if(!word1.isEmpty()){
            sb.append(word1);
        }
        if(!word2.isEmpty()){
            sb.append(word2);
        }

        return sb.toString();
    }
}
