public class SeniorCitizen {
    //https://leetcode.com/problems/number-of-senior-citizens/?envType=daily-question&envId=2024-08-01
    public static void main(String[] args) {
        String[] arr= {"7868190130M7522","5303914400F9211","9273338290F4010"};
        countSeniors(arr);
    }
    public static int countSeniors(String[] details) {
        int count=0;
        for(String str:details){
            int age=Integer.parseInt(str.substring(11,13));
            System.out.println(age);
            if(age>60){
                count++;
            }
        }
        return count;
    }
}
