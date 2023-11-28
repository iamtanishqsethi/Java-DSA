import java.util.Arrays;

public class plus_one {
    public static void main(String[] args) {
        int[] digits= {9};
        System.out.println(Arrays.toString(digits));
    }
    public int[] plusOne(int[] digits) {
    /*
        int temp = 0;
        for(int i = 0 ; i<digits.length;i++){
            temp=temp*10 +digits[i];
        }
        temp=temp+1;
        int len = (Integer.toString(temp)).length();
        if (len>digits.length){
            int[] arr = new int[digits.length+1];
            int i = arr.length-1;
            while(temp>0&&i>=0){
                arr[i]=temp%10;
                temp=temp/10;
                i--;
            }return arr;
        }else{
            int[] arr = new int[digits.length];
            int i = arr.length-1;
            while(temp>0&&i>=0){
                arr[i]=temp%10;
                temp=temp/10;
                i--;
            }return arr;
        }*/
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
