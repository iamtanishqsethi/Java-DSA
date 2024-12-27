public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String combined=s+s;
        if(combined.contains(goal)) return true;
        return false;
    }
    public boolean rotateString2(String s, String goal) {
        if (s.length()!=goal.length()) {
            return false;
        }
        if (s.equals(goal)) {
            return true;
        }
        String copy=s;
        do {
            s=s.substring(1) + s.charAt(0);
            if (s.equals(goal)) {
                return true;
            }
        } while (!s.equals(copy));
        return false;
    }

}
