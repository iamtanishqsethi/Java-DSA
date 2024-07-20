public class ValidPallindrome1 {
    //https://leetcode.com/problems/valid-palindrome/
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97&&s.charAt(i)<=122||s.charAt(i)>=48&&s.charAt(i)<=57){
                sb.append(s.charAt(i));
            }
        }

        int start=0;
        int end=sb.length()-1;
        while(start<=end){
            if(sb.charAt(start)!=sb.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
