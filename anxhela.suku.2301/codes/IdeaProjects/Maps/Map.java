package Maps;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        var people = new HashMap<String, Employee>();
        people.put("1", new Employee("A"));
        people.put("2", new Employee("B"));
        people.put("3", new Employee("C"));

        people.get("2");
        System.out.println(people);

        people.remove("1");
        System.out.println("After removing 1 " + people);

        System.out.println("KeySet: " + people.keySet());
        System.out.println("Values: " + people.values());

    }
}