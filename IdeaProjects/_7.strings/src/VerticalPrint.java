import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/print-words-vertically/
public class VerticalPrint {
    public List<String> printVertically(String s) {
        List<String> result=new ArrayList<>();
        String[] arr=s.split(" ");
        //calculate the maxLen
        int max=0;
        for(String str:arr){
            max=Math.max(max,str.length());
        }

        for (int i = 0; i < max; i++) {
            StringBuilder sb=new StringBuilder();
            for(String str:arr){
                if(i<str.length()){
                    sb.append(str.charAt(i));
                }
                else{
                    sb.append(" ");
                }
            }
            result.add(sb.toString().stripTrailing());//to remove any trailing white spaces
        }
        return result;
    }
}
