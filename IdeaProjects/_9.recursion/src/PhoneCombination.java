import java.awt.*;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class PhoneCombination {
    public List<String> letterCombinations(String digits) {
        String[] arr={
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        List<String> ans=new ArrayList<>();
        if (digits==null||digits.length()==0) {
            return ans;
        }
        StringBuilder proc=new StringBuilder();
        helperPhone(digits,proc,ans,arr);
        return ans;
    }
    private void helperPhone(String digits, StringBuilder proc, List<String> ans, String[] arr){
        if(digits.isEmpty()){
            ans.add(proc.toString());
            return;
        }
        int index=digits.charAt(0)-'0';
        String str=arr[index];
        for (int i = 0; i < str.length(); i++) {
            proc.append(str.charAt(i));
            helperPhone(digits.substring(1),proc,ans,arr);
            proc.deleteCharAt(proc.length()-1);//backtrack , because working with string builder
        }
    }

}
