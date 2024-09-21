public class BinaryString {
    //https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
    public static void main(String[] args) {
        System.out.println(findKthBit(3,5));
    }
    public static char findKthBit(int n, int k) {
        String proc=findString("0",n);
        System.out.println(proc);
        return proc.charAt(k-1);
    }
    private static String findString(String Sn,int n){
        if(n==1){
            return Sn;
        }
        StringBuilder sb = new StringBuilder(Sn);
        StringBuilder temp = operate(Sn);
        sb.append("1").append(temp);
        return findString(sb.toString(),n-1);

    }
    private static StringBuilder operate(String str){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                sb.append('0');
            }else{
                sb.append('1');
            }
        }
        return sb.reverse();
    }
}
