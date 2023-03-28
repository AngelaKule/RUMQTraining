package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SimpleReductions {
    
    public static void main(String[] args) {
        
        // count
        var cities = List.of("Toronto", "Vaughan", "Oakville", "Montreal");
        var citylist = new ArrayList<>(cities);
        long count = citylist.stream().count();
        System.out.println("Count : " + count);

        // min
        Optional<String> min = citylist.stream().min((c1,c2) -> c1.length() - c2.length());
        System.out.println("Min : " + min);
        System.out.println(min.orElse("No Name Found"));

        // max
        var max = citylist.stream().max(Comparator.comparing(String::length));
        System.out.println("Max : " + max);
        System.out.println(max.orElse("No Name Found"));

        // use stream of numbers
        int numbers = 25;
        var randonNumbers = Stream.generate(Math::random).map(n -> (int) (n*numbers)).limit(numbers).toList();

        // count , min , max
        count = randonNumbers.stream().count();
        System.out.println("Count number : " + count);
        var min2 = randonNumbers.stream().min(Integer::compare);
        System.out.println("Min number " + min2.get());

        // sum
        var sum = randonNumbers.stream().filter(n -> n >5 && n<25).mapToInt(Integer::intValue).sum();
        System.out.println("Sum : " + sum);

        // findFirst
        var first = randonNumbers.stream().findFirst();
        System.out.println("First : " + first);
        System.out.println(first.orElse(-1));

        // findAny
        var any = randonNumbers.stream().findAny();
        System.out.println("Any : " + any);
        System.out.println(any.orElse(-1));

        // anyMatch
        var anyMatch = randonNumbers.stream().anyMatch(n -> n==7);
        System.out.println("AnyMatch : " + anyMatch);

        // allMatch
        var allMatch = randonNumbers.stream().allMatch(n -> n<100);
        System.out.println("AllMatch : " + allMatch);

        // noneMatch 
        var noneMatch = randonNumbers.stream().noneMatch(n -> n==7);
        System.out.println("NoneMatch : " + noneMatch);

}
}