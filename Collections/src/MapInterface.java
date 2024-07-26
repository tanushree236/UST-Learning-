import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> map=Map.of("A",3,"B",5,"Z",10);
        System.out.println(map);

        //map.put("R",1)   gives error not possible
       System.out.println(map.get("A"));
        System.out.println(map.get("Z"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsKey("C"));
        System.out.println(map.containsValue(3));
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println("---------------------------------------------------------------");

        //HashMap
        Map<String,Integer> map1=new HashMap<>(map);
        map1.put("R",12);
        map1.put("T",6);
        System.out.println(map1);
        map1.put("Z",15);  //Z value changes from 10 to 15
        System.out.println(map1);
        System.out.println("-------------------------------");

        //LinkedHashMap
        LinkedHashMap<String,Integer> lmap=new LinkedHashMap<>();
        lmap.put("T",5);
        lmap.put("A",6);
        lmap.put("N",2);
        lmap.put("U",4);
        System.out.println(lmap);
        System.out.println("-------------------------------------------");

        //TreeMap
        TreeMap<String,Integer> tmap=new TreeMap<>();
        tmap.put("T",5);
        tmap.put("A",6);
        tmap.put("N",2);
        tmap.put("U",4);
        System.out.println(tmap);
        System.out.println("-------------------------------------------");
    }
}
