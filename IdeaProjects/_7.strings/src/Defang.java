public class Defang {
    //https://leetcode.com/problems/defanging-an-ip-address/description/
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
    public static String defangIPaddr(String address) {
        StringBuilder builder= new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch = address.charAt(i);
            if(ch=='.'){
                builder.append("["+"."+"]");
            }else{
                builder.append(ch);
            }
        }return builder.toString();
    }
}
