package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAndShufflingTest {

    public static void main(String[] args) {

        var names = List.of("Peter", "Paul", "Mary", "Adam", "Ethan", "Farhan");

        var namesList = new ArrayList<>(names);
        System.out.println(namesList);

        Collections.shuffle(namesList);
        System.out.println(namesList);

        Collections.sort(namesList);
        System.out.println(namesList);

        var numbers = new ArrayList<Integer>();
        for(int i =0; i<= 40; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        
        List<Integer> combination = numbers.subList(0, 6);
        Collections.sort(combination);
        System.out.println(combination);

    }

}