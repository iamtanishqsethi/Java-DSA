import java.util.ArrayList;

public class Subsequence {
    //to print all the sub sets of a string,note one sub set is "", empty string
    public static void main(String[] args) {
        subsequence("","abc");
        System.out.println();
        System.out.println(subseq("","abc"));
        subsequenceAscii("","abc");

    }
    static void subsequence(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.print(proc+" ");
            return;
        }
        char ch = unproc.charAt(0);
        // one call ,taking the char
        subsequence(proc+ch,unproc.substring(1));
        //another call ,ignoring the char
        subsequence(proc,unproc.substring(1));
    }

    //similar to previous example in arrays recursion
    static ArrayList<String> subseq(String proc,String unproc){
        if (unproc.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(proc);
            return list;
        }
        char ch = unproc.charAt(0);
        ArrayList<String> left = subseq(proc+ch,unproc.substring(1));
        ArrayList<String> right = subseq(proc,unproc.substring(1));
        //combine both
        left.addAll(right);
        // we can return any one as both are same
        return left;
    }
    static void subsequenceAscii(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch = unproc.charAt(0);
        subsequenceAscii(proc+ch,unproc.substring(1));
        subsequenceAscii(proc,unproc.substring(1));
        subsequenceAscii(proc+(ch+0),unproc.substring(1));
    }
}
