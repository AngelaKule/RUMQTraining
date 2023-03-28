package assignment.March1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamFile {
    
    public static void main(String[] args) throws IOException {
        
        String file = "assignment/March1/70191-0.txt";
        try (var lines = Files.lines(Path.of(file))) {
            var count = lines
            .flatMap(line -> Stream.of(line.split("\\s+")))
            .filter(word -> word.length() > 8)
            .count();
      
            System.out.println("Words with 8+ characters : " + count);
        }


    }
}
