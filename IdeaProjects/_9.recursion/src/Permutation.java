import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutations("","abc");
        ArrayList<String> ans = permutationsList("","abc");
        System.out.println(ans);
        System.out.println(permutationscount("","abc"));
    }
    static void permutations(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch =  unproc.charAt(0);
        for(int i =0;i<=proc.length();i++){
            String first = proc.substring(0,i);
            String second = proc.substring(i,proc.length());
            permutations(first+ch+second,unproc.substring(1));
        }
    }
    static ArrayList<String> permutationsList(String proc, String unproc){
        if(unproc.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }
        char ch =  unproc.charAt(0);
        // local list for each particular cal
        ArrayList<String> ans = new ArrayList<>();

        for(int i =0;i<=proc.length();i++){
            String first = proc.substring(0,i);
            String second = proc.substring(i,proc.length());
            ans.addAll(permutationsList(first+ch+second,unproc.substring(1)));
        }

        return ans;
    }

    static int permutationscount(String proc,String unproc){
        if(unproc.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch =  unproc.charAt(0);
        for(int i =0;i<=proc.length();i++){
            String first = proc.substring(0,i);
            String second = proc.substring(i,proc.length());
            count = count + permutationscount(first+ch+second,unproc.substring(1));
        }
        return count;
    }

}
