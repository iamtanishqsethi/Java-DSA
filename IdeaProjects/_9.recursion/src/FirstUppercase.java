public class FirstUppercase {
    //https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
    public static void main(String[] args) {
        firstUpper("");
    }
    static void firstUpper(String str){
        if(str.equals("")){
            System.out.println("string empty");
            return;
        }
        if(Character.isUpperCase(str.charAt(0))){
            System.out.println(str.charAt(0));
            return;
        }
        firstUpper(str.substring(1,str.length()));
    }
}
