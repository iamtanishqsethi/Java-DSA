public class RobotOrigin {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UDLLRRRLDU"));
    }
    public static boolean judgeCircle(String moves) {
        int up = 0;
        int down =0;
        int left =0;
        int right =0;
        for(int i =0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                up++;
            }
            else if(moves.charAt(i)=='D'){
                down++;
            }
            else if(moves.charAt(i)=='L'){
                left++;
            } else if (moves.charAt(i)=='R') {
                right++;
            }
        }
        return (up==down)&&(left==right);
    }
}
