package assignment.Feb9;

import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;

public class MapClass {
    public static void main(String[] args) {
        // SECTION 1 : FIND COMMON ELEMENT BETWEEN 2 MAPS
        var map1 = new HashMap<>();
        var map2 = new HashMap<>();

        // add random elements to each map
        Random rnd = new Random();

        for (int i = 0; i < 4; i++) {
            int key = rnd.nextInt(10);
            int value = rnd.nextInt(20);
            map1.put(key, value);
        }

        for (int i = 0; i < 4; i++) {
            int key = rnd.nextInt(10);
            int value = rnd.nextInt(20);
            map2.put(key, value);
        }

        System.out.println("Map 1 ");
        for (Entry<Object, Object> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Map 2 ");
        for (Entry<Object, Object> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        for (Entry<Object, Object> entry : map1.entrySet()) {
            if(map2.containsKey(entry.getKey()) && map2.containsValue(entry.getValue())){
                System.out.println("Common key " + entry.getKey() + " with a value of " + entry.getValue());
            }
        }

        // SECTION 2 : FIND A KEY IN A MAP
        Integer keyFind = 7;
        for (Entry<Object, Object> idx : map1.entrySet()){
            if(keyFind == idx.getKey()){
                System.out.println("Key " + keyFind + " was found on Map 1 and it has a value of " + idx.getValue());
            }
        }

        // SECTION 3 : REMOVE DUPLICATION ON A MAP
        var mapBefore = new HashMap<>();
        var mapAfter = new HashMap<>();
        mapBefore.put(0, 2);
        mapBefore.put(1, 2);
        mapBefore.put(2, 2);
        mapBefore.put(3, 2);
        mapBefore.put(0, 2);
        mapBefore.put(4, 2);
        mapBefore.put(4, 2);
        mapBefore.put(0, 2);

        System.out.println("New Map 2 :");
        for (Entry<Object, Object> entry : mapBefore.entrySet()) {
            if(!mapAfter.containsKey(entry.getKey())){
                mapAfter.put(entry.getKey(), entry.getValue());
            }
        }

        for (Entry<Object, Object> entry : mapAfter.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



    }
}
