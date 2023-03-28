package assignment.Feb10;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class MapClass {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // SECTION 1 : Write a program to find the maximum and minimum values in a Map.
        var map1 = new HashMap<>();
        Random rnd = new Random();

        // add randon key and values
        for (int i = 0; i < 10; i++) {
            int key = rnd.nextInt(10);
            int value = rnd.nextInt(20);
            map1.put(key, value);
        }

        // print the map
        for (Entry<Object, Object> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;

        for (Object value : map1.values()) {
            int var = (Integer) value;
            if(var < min){
                min = var;
            }
            if(var > max){
                max = var;
            }
        }

        // print max and min
        System.out.println("The maximum value for this map is : " + max);
        System.out.println("The minimum value for this map is : " + min);

        // SECTION 2 : Write a program to convert a Map to a List.
        List<Integer> listKey = new ArrayList<>();
        List<Integer> listValues = new ArrayList<>();

        for (Entry<Object, Object> entry : map1.entrySet()) {
            listKey.add((Integer) entry.getKey());
        }

        for (Entry<Object, Object> entry : map1.entrySet()) {
            listValues.add((Integer) entry.getValue());
        }

        // Print list key and value

        System.out.println();
        System.out.println("List of keys : ");
        for (Integer integer : listKey) {
            System.out.print(integer + "  ");
        }

        System.out.println();
        System.out.println("List of values : ");
        // Print list key and value
        for (Integer integer : listValues) {
            System.out.print(integer + "  ");
        }

    }
}