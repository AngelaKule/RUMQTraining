package assignment.Feb10;

public class Person {
    
    // Attributes
    int age;
    String name;

    // Constructors
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // toString

    @Override
    public String toString() {
        return "Name : " + name + ";  Age : " + age;
    }

}
