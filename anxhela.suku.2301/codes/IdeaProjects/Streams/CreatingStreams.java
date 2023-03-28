package Streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.io.IOException;

public class CreatingStreams {

    public static void main(String[] args) throws IOException {
        
        // **********************  Try out all the ways of creating a stream. *********************************

        // Empty
        var emptyStream = Stream.empty();
        show("Empty Stream ", emptyStream);
        
        // Collection
        var list = List.of("Anna", "Johny", "Ava", "Ryan");
        var listStream = list.stream();
        show("Collection Stream ", listStream);

        // Array
        var array = new Integer [] {1,33,5,6,7,56765,4321,656,12312,56};
        var arrayStream = Stream.of(array);
        show("Array Stream", arrayStream);

        // Part of an array
        var partOfArray = Arrays.stream(array, 3, 9);
        show("Part of an Array Stream", partOfArray);

        // Infinite Stream
        var randomStream = Stream.generate(Math::random);
        show("Infinite Stream Number", randomStream);

        // Infinite Stream Constant
        var constStream = Stream.generate(() -> "AS");
        show("Infinite Stream Constant", constStream);

        // Infinite Stream Counting
        var countStream = Stream.iterate(1, n -> n * 4);
        show("Infinite Stream Counting", countStream);

        // Limit Infinite Stream
        var limitStream = Stream.iterate(1, n -> n * 4).limit(10);
        var limitStream2 = Stream.iterate(1 , n -> n <= 100, n -> n * 4);
        show ("Limit Infinite Stream index", limitStream);
        show ("Limit Infinite Stream value", limitStream2);

        // Nullable
        var nullStream = Stream.ofNullable(null);
        var nullStream2 = Stream.ofNullable(List.of("AS", "FK", "AB", "KK"));
        show ("Null Infinite Stream", nullStream);
        show ("Null Infinite Stream Value", nullStream2);

        // String
        var str = "Roses \n are \n  Red.".lines();
        show("String Stream", str);

        // Pattern
        var patternStream = Pattern.compile(":").splitAsStream("One : Two : Three : Four : Five");
        show("Pattern Stream", patternStream);

        // Scanner
        //var scannerStream = new Scanner("Roses are red").tokens();
        //show("Scanner Stream", scannerStream);
        
        // Interference
        var numbers = new ArrayList<>(List.of("342","444","4234"));
        var intStream = numbers.stream();
        numbers.add("566");

        intStream.forEach(s ->{
            if(s.equals("444")){
                System.out.println(s);
            }
        });

        try (// File
        var fileStream = Files.lines(Path.of("codes/IdeaProjects/Streams/stream.txt"))) {
            show("File Stream", fileStream);
        }


    }

    public static <T> void show(String title, Stream<T> stream)
   {
      final int SIZE = 10;
      List<T> firstElements = stream
         .limit(SIZE + 1)
         .toList();
      System.out.print(title + ": ");
      for (int i = 0; i < firstElements.size(); i++)
      {
         if (i > 0) System.out.print(", ");
         if (i < SIZE) System.out.print(firstElements.get(i));
         else System.out.print("...");
      }
      System.out.println();
   }

}