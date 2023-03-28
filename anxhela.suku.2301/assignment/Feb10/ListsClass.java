package assignment.Feb10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListsClass {
    public static void main(String[] args) {
        
        // SECTION 1 : Write a program to sort a List of custom objects based on a property.

        List<Person> people = new ArrayList<>();

        Person person1 = new Person(20, "Adam");
        Person person2 = new Person(24, "Jonny");
        Person person3 = new Person(19, "Bryan");

        people.add(person1);
        people.add(person2);
        people.add(person3);
        
        // sort by Age
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Ordered by Age");
        for (Person person : people) {
            System.out.println(person);
        }

        // sort by Name
        people.sort(Comparator.comparing(Person::getName));
        System.out.println("Ordered by Name");
        for (Person person : people) {
            System.out.println(person);
        }

        // SECTION 2 : Write a program to find the common elements between two Lists.

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> commonElements = new ArrayList<>();

        Random rnd = new Random();

        // add elements to list1 and 2
        for (int i = 0; i < 4; i++) {
            list1.add(rnd.nextInt(10));
        }

        for (int i = 0; i < 4; i++) {
            list2.add(rnd.nextInt(20));
        }

        // loop through the list to find common elements
        for (Integer integer : list2) {
            for (Integer integer2 : list1) {
                if(integer == integer2){
                    commonElements.add(integer);
                }
            }
        }

        // Print lists

        System.out.println("First list :");
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }

        System.out.println();
        System.out.println("Second list :");
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }

        System.out.println();
        if(!commonElements.isEmpty()){
            System.out.println("Common Elements :");
            for (Integer integer : commonElements) {
                System.out.print(integer);
            }
        }
        else{
            System.out.println("No common elemnts were found !");
        }
        

    }
}
