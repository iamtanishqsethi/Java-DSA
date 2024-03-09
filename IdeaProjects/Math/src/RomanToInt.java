public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int i = s.length()-1;
        int sum=0;
        while(i>=0){
            if(s.charAt(i)=='I'){
                sum+=1;
                i--;
            } else if (s.charAt(i)=='V') {
                if(i-1>=0&&s.charAt(i-1)=='I'){
                    sum+=4;
                    i-=2;
                }
                else{
                    sum+=5;
                    i--;
                }
            } else if (s.charAt(i)=='X') {
                if(i-1>=0&&s.charAt(i-1)=='I'){
                    sum+=9;
                    i-=2;
                }
                else{
                    sum+=10;
                    i--;
                }
            }
            else if (s.charAt(i)=='L') {
                if(i-1>=0&&s.charAt(i-1)=='X'){
                    sum+=40;
                    i-=2;
                }
                else{
                    sum+=50;
                    i--;
                }
            }
            else if (s.charAt(i)=='C') {
                if(i-1>=0&&s.charAt(i-1)=='X'){
                    sum+=90;
                    i-=2;
                }
                else{
                    sum+=100;
                    i--;
                }
            }
            else if (s.charAt(i)=='D') {
                if(i-1>=0&&s.charAt(i-1)=='C'){
                    sum+=400;
                    i-=2;
                }
                else{
                    sum+=500;
                    i--;
                }
            }
            else if (s.charAt(i)=='M') {
                if(i-1>=0&&s.charAt(i-1)=='C'){
                    sum+=900;
                    i-=2;
                }
                else{
                    sum+=1000;
                    i--;
                }
            }
        }
        return sum;
    }
}
