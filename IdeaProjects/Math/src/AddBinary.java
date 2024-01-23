public class AddBinary {
    //https://leetcode.com/problems/add-binary/description/
    public static void main(String[] args) {
        System.out.println(addBinary("110","10"));
    }
    public static String addBinary(String a, String b) {
        StringBuilder x = new StringBuilder();
        //upper limits ,as we will traverse from LSB
        int i = a.length()-1;
        int j =b.length()-1;
        int carry =0;
        while(i>=0||j>=0){//traversing backwards
            int sum  =carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }if(j>=0){
                sum+=b.charAt(j)-'0';
            }x.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        }if(carry!=0){//if any extra carry is left we append that
            x.append(carry);
        }return (x.reverse() ).toString();//reversing as we are originally appending at the last
    }
}
