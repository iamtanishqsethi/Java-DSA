public class Skip_char_and_string {


    public static void main(String[] args) {
        //skip("","baccad");
        System.out.println(skip2("baccad"));
    }
    // 1 to skip  a particular character from the string
    //Method 1 to take the resultant string in argument of function
    static void skip(String proc,String unproc){
        // alternatively we can also use string builder
        if( unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch = unproc.charAt(0);
        if(ch=='a'|| ch=='A'){//skipping 'a'
            skip(proc,unproc.substring(1));
        }
        else{
            skip(proc+ch,unproc.substring(1));
        }
    }
    //Method 2 , not taking the ans in argument
    static String skip2(String unproc){
        if(unproc.isEmpty()){
            return "";
        }
        char ch = unproc.charAt(0);
        if(ch=='a'){
            return skip2(unproc.substring(1));
        }else{
            return ch+skip2(unproc.substring(1));
        }
    }
    //to skip the part of the string if it starts from particular string
    // in this example we will take "apple"
    static String skipstring(String unproc){
        if(unproc.isEmpty()){
            return "";
        }
        if(unproc.startsWith("apple")){
            return skip2(unproc.substring(5));
        }else{
            return unproc.charAt(0)+skip2(unproc.substring(1));
        }
    }
}
