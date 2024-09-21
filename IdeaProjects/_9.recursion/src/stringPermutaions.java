import java.util.ArrayList;
import java.util.List;

public class stringPermutaions {
    public List<String> find_permutation(String S) {
        return helper(S,"");
    }
    private List<String> helper(String unproc,String proc){
        if(unproc.isEmpty()){
            List<String> ans=new ArrayList<>();
            ans.add("proc");
            return ans;
        }
        List<String> ans=new ArrayList<>();
        char ch=unproc.charAt(0);
        for(int i =0;i<=proc.length();i++){
            String first=proc.substring(0,i);
            String second=proc.substring(i,proc.length());
            ans.addAll(helper(unproc.substring(1),first+ch+second));
        }
        return ans;
    }

}
