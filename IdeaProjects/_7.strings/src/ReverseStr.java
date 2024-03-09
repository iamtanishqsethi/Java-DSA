public class ReverseStr {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));

    }
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder rev= new StringBuilder();
        for(int i=0;i< words.length;i++){
            StringBuilder builder= new StringBuilder(words[i]);
            rev.append(builder.reverse());
            if(i!= words.length-1){
                rev.append(" ");
            }
        }
        return rev.toString();
    }
}
