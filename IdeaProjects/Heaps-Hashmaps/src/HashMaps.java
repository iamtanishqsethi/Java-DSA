import java.util.HashMap;
import java.util.HashSet;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap <>();
        map.put("Tanishq",95);
        map.put("alan",67);
        map.put("bruce",78);
//        System.out.println(map.get("Tanishq"));
        System.out.println(map.containsKey("Tanishq"));
        System.out.println(map.getOrDefault("tony",90));
        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(78);
        set.add(56);//set will only add the unique elements in it
        set.add(1);
        set.add(90);
        System.out.println(set);
        //can convert it to tree map , it will store it in sorted order
        //hashmap is not thread safe , not synchronized
        //whereas hash table  is thread safe and synchronized

    }

}
