package assignment.March9;

import java.util.List;

import static java.util.stream.Collectors.*;

import java.util.Comparator;

public class Downstream {
    
    // Recreate DownstreamCollectorsTest.java with the Things class you've created as part of previous assignment.

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

        // Group by Type 
        var groupThing = thing.stream().collect(groupingBy(Thing::Type));
        System.out.println("Group by Type : " + groupThing);
        System.out.println("Group by Type Electronics" + groupThing.get("Electronics"));

        // Get counts for each type
        var countType = thing.stream().collect(groupingBy(Thing::Type, counting()));
        System.out.println("Counts by Type : " + countType);

        // Contrast with counting (counting all values)
        var contrastType = thing.stream().collect(counting());
        System.out.println("Contrast : " + contrastType);

        // ToSet
        var setType = thing.stream().collect(groupingBy(Thing::Type,toSet()));
        System.out.println("Set " + setType);
        System.out.println("Set Clothing " + setType.get("Clothing"));

        // Collecting and Then (To set and get size)
        var catType = thing.stream()
                .collect(groupingBy(Thing::Type, collectingAndThen(toSet(), set -> set.size())));
        System.out.println("Collecting and Then: " + catType);

        // Mapping to name and create a set
        var mapSetName = thing.stream().collect(groupingBy(Thing::Type, mapping(map -> map.name(), toSet())));
        System.out.println("Mapping names and convert to set " + mapSetName);

        // summingInt
        var summType = thing.stream().collect(groupingBy(Thing::Type, summingInt(th -> th.name().length())));
        System.out.println("SummingInt Result = " + summType);

        // maxBy - longest name
        var longName = thing.stream().collect(groupingBy(Thing::Type, maxBy(Comparator.comparingInt(longs -> longs.name().length())) ));
        System.out.println("Longest name " + longName);

        // teeing - count and sum
        var countandSum = thing.stream()
        .collect(groupingBy(Thing::Type, 
        teeing(counting(), 
        summingInt(longs -> longs.name().length()), 
        (count,sum) -> "Name count : " + count + " , Sum name lengths " + sum)));
        System.out.println("Merging count and sum");
        System.out.println(countandSum);

    }

}

record Thing(String name, String Type){

}

