public class Reversewords {
    //https://leetcode.com/problems/reverse-words-in-a-string/
    public String reverseWords(String s) {
        s=s.strip();
        String[] arr= s.split("\\s+");//removing multiple white spaces
        StringBuilder sb=new StringBuilder();
        for (int i = arr.length-1; i >=0 ; i--) {
            sb.append(arr[i].strip());
            if(i!=0){
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}
