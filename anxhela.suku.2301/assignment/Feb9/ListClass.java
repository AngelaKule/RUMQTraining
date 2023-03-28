package assignment.Feb9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListClass {
    
    public static void main(String[] args) {
        // SECTION 1 : CREATE A LIST , ADD ELEMENTS AND ITERATE
        // declaring list
        List<Integer> numbers = new ArrayList<>();

        // adding random values
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            numbers.add(rnd.nextInt(100));
        }
        
        // iterating on the list
        System.out.println("The random List : ");

        Iterator<Integer> i = numbers.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + " ");
        }
        // SECTION 2 : ARRAYLIST TO ARRAY AND VICE VERSA
         // Arraylist to Array
         Integer [] numbersArray = new Integer[numbers.size()];
         numbersArray = numbers.toArray(numbersArray);

         System.out.println();
         System.out.println("New Array Elements");

         for(int idx = 0; idx < numbersArray.length; idx++){
            System.out.print( numbersArray[idx] + " ");
         }

         // Array to Arraylist
         Integer [] intArray = new Integer[10];

         System.out.println();
         System.out.println("Random Array created : ");

         for (int idx = 0; idx < 10; idx++){
            intArray[idx] = rnd.nextInt(100);
            System.out.print(intArray[idx] + " ");
         }

         System.out.println();

         List<Integer> intList = new ArrayList<>(Arrays.asList(intArray));

         Iterator<Integer> it = intList.iterator();
         System.out.println("The new List : ");
         while(it.hasNext()){
            System.out.print(it.next() + " ");
         }

         // SECTION 3 : USE ADDALL() TO CREATE A SECOND LIST FROM A CURRENT LIST

         List<Integer> copyOfIntList = new ArrayList<>();
         copyOfIntList.addAll(intList);

         System.out.println();
         System.out.println("Copy of the new list : " + copyOfIntList);

    }

}
