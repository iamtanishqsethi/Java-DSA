import java.util.ArrayList;
import java.util.List;
//not competed
public class ArrayForm {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int x = 0;
        for(int i =0;i<num.length;i++){
            x=x*10+num[i];
        }
        int sum = x+k;
        String str = Integer.toString(sum);
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            int y = (int)c;
            list.add(y);
        }return list;
    }
}
