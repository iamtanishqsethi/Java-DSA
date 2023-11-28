import java.util.List;
//to return value on the basis of matching rule
public class matching_rule {
    public static int countmatches(List<List<String>> items,String ruleKey,String ruleValue){
        int res = 0;
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type") &&items.get(i).get(0).equals(ruleValue)){
                res++;
            }if(ruleKey.equals("color") &&items.get(i).get(1).equals(ruleValue)){
                res++;
            }if(ruleKey.equals("name") &&items.get(i).get(2).equals(ruleValue)){
                res++;
            }
        }return res;
    }
}
