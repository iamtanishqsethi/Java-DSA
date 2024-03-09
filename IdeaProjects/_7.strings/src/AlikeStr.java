public class AlikeStr {
    //not efficient
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
    public static boolean halvesAreAlike(String s) {
        int halflen = s.length()/2;
        String first = s.substring(0,halflen);
        String second = s.substring(halflen,s.length());
        int count1=0;
        int count2=0;
        for(int i =0;i<first.length();i++){
            if(first.charAt(i)=='a'||first.charAt(i)=='e'||first.charAt(i)=='i'||first.charAt(i)=='o'||first.charAt(i)=='u'||first.charAt(i)=='A'||first.charAt(i)=='E'||first.charAt(i)=='I'||first.charAt(i)=='O'||first.charAt(i)=='U'){
                count1++;
            }
        }for(int i =0;i<second.length();i++){
            if(second.charAt(i)=='a'||second.charAt(i)=='e'||second.charAt(i)=='i'||second.charAt(i)=='o'||second.charAt(i)=='u'||second.charAt(i)=='A'||second.charAt(i)=='E'||second.charAt(i)=='I'||second.charAt(i)=='O'||second.charAt(i)=='U'){
                count2++;
            }
        }
        return count1==count2;
    }
}
