package Classes;
import java.util.ArrayList;
import java.util.List; 

public class AnxhelaPerson{
    
    public String name;

    public AnxhelaPerson(String name){
        this.name = name;
        System.out.println(name);
    }

    public String getName(){
        return name;
    }

    public static void main (String[] args){
        System.out.println("Hello World!");
        AnxhelaPerson obj = new AnxhelaPerson("Anxhi");
        obj.One();
        obj.Two();
        obj.Three();
        
        System.out.println(GetList());

        String [] Person = {"Kajardo", "Aina", "Fjorelo", "Anxhela"};

        for (String name : Person){
            System.out.println(name);
        }

        ArrayList <String> PersonList = new ArrayList<>();
        PersonList.add("Anxhela");
        PersonList.add("Anxhela");
        PersonList.add("Anxhela");
        PersonList.add("Anxhela");

        for (String name : PersonList){
            System.out.println(name);
        }

    }

    public void One() {
        System.out.println("One");
        // call 3 from 1
        Three();
    }

    public void Two() {
        System.out.println("Two");
        // call one method from Two method
         One();
         // call three from two
         Three();
    }

    public void Three(){
        System.out.println("Three");
    }

    public int CompareTo(){
        return 0;
    }

    public static List<AnxhelaPerson> GetList() {
        ArrayList<AnxhelaPerson> ListA = new ArrayList<>();
        ListA.add(new AnxhelaPerson("A"));
        ListA.add(new AnxhelaPerson("B"));
        ListA.add(new AnxhelaPerson("C"));
        ListA.add(new AnxhelaPerson("D"));
        return ListA;
    }

}