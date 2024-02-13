import java.util.ArrayList;

public class DiceProblem {
    public static void main(String[] args) {
        System.out.println(diceret("",4));
    }
    static void dice(String proc, int target){
        if(target==0){
            System.out.println(proc);
            return;
        }
        for (int i =1;i<=6 && target>=i;i++){
            dice(proc+i,target-i);
        }
    }
    static ArrayList<String> diceret(String proc, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
            list.add(proc);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i =1;i<=6 && target>=i;i++){
            list.addAll(diceret(proc+i,target-i));

        }
        return list;
    }
    static void dicecustom(String proc, int target,int face){
        if(target==0){
            System.out.println(proc);
            return;
        }
        for (int i =1;i<=face && target>=i;i++){
            dicecustom(proc+i,target-i,face);
        }
    }
}
