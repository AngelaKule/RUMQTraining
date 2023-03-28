package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz7 {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "Bob", "Alice");

        Map<String, Integer> nameCount = new HashMap<>();
        Map<String, List<String>> personList = new HashMap<>();

        for (String name : names) {
            if (nameCount.containsKey(name)) {
                nameCount.put(name, nameCount.get(name) + 1);
            } else {
                nameCount.put(name, 1);
            }
        }

        for (String name : names) {
            if (personList.containsKey(name)) {
                personList.get(name).add(name);
            } else {
                personList.put(name, new ArrayList<>(Arrays.asList(name)));
            }
        }
        System.out.println("************** KEY -> NAME ; VALUE -> COUNT");
        System.out.println(nameCount);
        System.out.println("************** KEY -> NAME ; VALUE -> List of persons");
        System.out.println(personList);
    }
}
