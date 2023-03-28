package Streams;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterFlatMultiMap {
    
    public static void main(String[] args) {
    
    // Filter Operation

    List<Integer> numbers = List.of(1,2,3,5,7,8,9,54,34,3231,34,4,53,65);

    var filterNo = numbers.stream()
    .filter(number -> number > 50)
    .toList();

    System.out.println(filterNo);

    // Map Operation

    var cities = List.of("Toronto", "Oakville", "Vaughan", "North York", "Montreal", "Quebec");

    var cityLengths = cities.stream()
    .map(city -> city.length())
    .toList();

    System.out.println("Length : " + cityLengths);

    var upperCaseCities = cities.stream()
    .map(String::toUpperCase)
    .toList();

    System.out.println("Upper Case " + upperCaseCities);

    // Flat Map Operation

    var numbersAndCities =List.of(List.of(1,2,3,5,7,8,9,54,34,3231,34,4,53,65), 
    List.of("Toronto", "Oakville", "Vaughan", "North York", "Montreal", "Quebec"));

    var nandClist = numbersAndCities.stream()
    .flatMap(list -> list.stream())
    .toList();

    System.out.println(nandClist);

    // Complex Flat Map Operation

    // split on characters
    var complexCities = List.of("Toronto", "Oakville", "Vaughan", "North York", "Montreal", "Quebec");

    var complexMap = complexCities.stream()
    .flatMap(cmap -> cmap.chars().mapToObj(c ->  (char) c))
    .toList();

    System.out.println("Split Characters " + complexMap);

    // difference between chars and chars (ASCII)
    IntStream var = "Toronto".chars();
    var.forEach(System.out::println);

    Stream<Character> var2 = "Toronto".chars().mapToObj(c -> (char) c);
    var2.forEach(System.out::println);
    
    // Multi Map

    var multiCities = cities.stream()
    .mapMulti((city, downstream)->{
        downstream.accept(city.length());
    })
    .toList();

    System.out.println("City lenght as per Multi Map " + multiCities);

    // version 2 
    var multiCities2 = cities.stream()
    .mapMulti((city, downstream)->{
        downstream.accept(city.length());
        downstream.accept(city.length()+ 10);
        downstream.accept(city.length()+ 100);
    })
    .toList();

    System.out.println("City lenght as per Multi Map version 2 " + multiCities2);
    }
}
