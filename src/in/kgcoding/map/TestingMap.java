package in.kgcoding.map;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    public static void main(String[] args) {
        
    
    Map<String,Integer> map=new HashMap<>();
    map.put("Prashant", 34);
    map.put("Sanchit", 100);
    map.put("Ram", 100);
    map.put("sohan", 0);
    map.put("mohan", 84);

    System.out.println(map.size());
    System.out.println(map.get("mohan"));
    System.out.println(map.containsKey("Ram"));
    System.out.println(map.containsKey("monu"));
    System.out.println(map.remove("sohan"));
    System.out.println(map.size());

    for(String key:map.keySet()){
        System.out.printf("%s:%s\n",key,map.get(key));
    }

    }  
}
