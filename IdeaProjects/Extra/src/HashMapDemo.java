import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"tanishq");
        map.put(2,"kunal");
        map.put(3,"ra");
        String s=map.get(2);
        System.out.println(map.containsKey(23));
        System.out.println(s);
        Set<Integer> keys=map.keySet();//we get a set of all the keys
        //and set data structure cannot have duplicate values
        for(int i:keys){
            System.out.println(map.get(i));
        }

        Set< Map.Entry<Integer,String>> entries=map.entrySet();
        //we get a collection of all the key and values
        for(Map.Entry<Integer,String> i :entries){
            System.out.println(i.getKey()+":"+i.getValue());
        }
    }
}
