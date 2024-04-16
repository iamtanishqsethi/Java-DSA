public class StringLength {
    //to find the string length using recursion
    public static void main(String[] args) {
        System.out.println(length("tanishq"));
    }
    static int length(String str){
        if(str.equals("")){
            return 0;
        }
        return length(str.substring(1))+1;
    }
}
