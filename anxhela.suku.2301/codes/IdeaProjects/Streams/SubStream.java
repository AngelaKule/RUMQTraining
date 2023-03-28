package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SubStream {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // limit
        var firstT = Stream
        .iterate(1 , n -> n+1)
        .limit(20)
        .toList();

        System.out.println("First 20 numbers : " + firstT);

        // skip
        var skipfirstT = Stream
        .iterate(1 , n -> n+1)
        .skip(100)
        .limit(20)
        .toList();

        System.out.println("Skip First 20 numbers : " + skipfirstT);

        // take while
        var randomValue = Stream
        .generate(Math::random)
        .map(n -> (int) (n*20))
        .limit(20)
        .toList();

        System.out.println("Randon Numbers : " + randomValue);

        var takeWhile  = randomValue.stream()
        .takeWhile(n -> n <= 8)
        .toList();

        System.out.println("Size of takeWhile : " + takeWhile.size());
        System.out.println("TakeWhile : " + takeWhile);

        // dropwhile

        var dropWhile = randomValue.stream()
        .dropWhile( n -> n <=8)
        .toList();

        System.out.println("Size of dropWhile : " + dropWhile.size());
        System.out.println("DropWhile : " + dropWhile);

        // concat 
        var concatList = Stream.concat(
            randomValue.stream().takeWhile(n -> n<=8).limit(20), 
            randomValue.stream().dropWhile(n -> n<=8)).toList();
        
        System.out.println("Size of concatList : " + concatList.size());
        System.out.println("ConcatList : " + concatList);
        System.out.println();
        // *******************************************************************************************************

        // List of 15 integers  0 - 9 

        var list = Stream.generate(Math::random).map(n -> (int) (n*10)).limit(15).toList();
        System.out.println("Random list of 15 " + list);

        // Using Distinct

        var distinctList = list.stream().distinct().toList();
        System.out.println("Ditinct List " + distinctList);

        // method 2 
        var distinct2 = Stream.generate(Math::random).map(n -> (int) (n*10)).limit(15).distinct().toList();
        System.out.println("Method 2 for distinct " + distinct2);

        // Sorted
        var sortedList = list.stream().sorted().toList();
        System.out.println("Sorted List Stream " + sortedList);

        // using comparator
        var cities = List.of("Toronto", "Oakville", "Vaughan", "North York", "Montreal", "Quebec");
        var citiesList = new ArrayList<>(cities);
        var sortedCities = citiesList.stream().sorted(Comparator.comparing(String::length)).toList();
        System.out.println("Sorted using comparator " + sortedCities);

        // reverse sorted & peek
        var sortedCities2 = citiesList.stream().sorted(Comparator.comparing(String::length).reversed()).peek(x -> {return;}).toList();
        System.out.println("Version 2 " + sortedCities2);
    }
}
