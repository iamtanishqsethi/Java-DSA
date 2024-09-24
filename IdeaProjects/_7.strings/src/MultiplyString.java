public class MultiplyString {
    //https://leetcode.com/problems/multiply-strings/
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        int len1=num1.length();
        int len2=num2.length();
        int[] result= new int[len2+len1];
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                int prod=(num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int onesPlace=i+j;
                int tensPlace=i+j+1;
                int sum=prod+result[tensPlace];
                result[tensPlace]=sum%10;
                result[onesPlace]+=sum/10;
            }
        }
        StringBuilder sb=  new StringBuilder();
        for(int num:result){
            if(!(sb.length()==0 && num==0)){//skipping leading zeros
                sb.append(num);
            }
        }
        if(sb.length()==0){
            return "0";

        }
        return sb.toString();
    }
}
