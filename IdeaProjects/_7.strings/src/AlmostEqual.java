import java.util.HashMap;
//https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
public class AlmostEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }

        int count=0;
        int first=-1;
        int second=-1;
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count>2){
                    return false;
                }
                if(first==-1){//tracking first index
                    first=i;
                }
                else{//tracking second index
                    second=i;
                }
            }

        }
        return count==2 && s1.charAt(first)==s2.charAt(second) &&s1.charAt(second)==s2.charAt(first);

    }
}
