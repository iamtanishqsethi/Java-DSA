public class ShiftingLetters {
    //https://leetcode.com/problems/shifting-letters/
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb= new StringBuilder();
       int[] totalShift=new int[shifts.length];
       int current=0;
        for (int i = totalShift.length-1; i >=0 ; i--) {
            current = (current + shifts[i]) % 26;
            totalShift[i] = current;
        }
        for (int i = 0; i < s.length(); i++) {
            char currentChar=s.charAt(i);
            currentChar=(char)(currentChar+totalShift[i]);
            if(currentChar>'z'){
                currentChar=(char)(currentChar-26);
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }
}
