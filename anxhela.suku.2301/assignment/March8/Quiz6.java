package assignment.March8;

import java.util.List;
import java.util.stream.Collectors;

public class Quiz6 {
    
    // Create the classes from Quiz 6. (Class/Record) Thing should have properties name, 
    // type (type can be Enum ). Create between 5 to 10 objects you own. Group them by the type

    public static void main(String[] args) {
        var thing = List.of(
            new Thing("Phone", "Electronics"),
            new Thing("Laptop", "Electronics"),
            new Thing("Shirt", "Clothing"),
            new Thing("Dress", "Clothing"),
            new Thing("Smartwatch", "Electronics"),
            new Thing("Spoon", "Utensils"),
            new Thing("Fork","Utensils")

        );

        var groupThing = thing.stream().collect(Collectors.groupingBy(thing1 -> thing1.Type ()));
        System.out.println(groupThing);

    }

}

record Thing(String name, String Type){

}
