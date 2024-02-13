import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(padret("","12"));
        System.out.println(padcount("","12"));
    }
    static void pad(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        int digit=unproc.charAt(0)-'0';//converting char to string
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(proc+ch,unproc.substring(1));
        }
    }
    static ArrayList<String> padret(String proc, String unproc){
        if(unproc.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(proc);
            return list;
        }
        int digit=unproc.charAt(0)-'0';//converting char to string
        ArrayList<String> list = new ArrayList<>();

        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            list.addAll(padret(proc+ch,unproc.substring(1)));
        }
        return list;
    }
    static int padcount(String proc,String unproc){
        if(unproc.isEmpty()){
            return 1;
        }
        int count =0;//local count of that recursion call
        int digit=unproc.charAt(0)-'0';//converting char to string
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            count = count + padcount(proc+ch,unproc.substring(1));
        }
        return count;
    }
}
