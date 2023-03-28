package assignment.Feb8;

public class Main {
    
    public static void main(String[] args) {

        // Encapsulation (Bank Scenario)
        BankAccount account1 = new BankAccount(4000);
        account1.deposit(200);
        account1.withdraw(3000);
        account1.deposit(10);
        account1.withdraw(2000);

        // Inheritance (Shape example)
        Rectangle rec1 = new Rectangle(3.5, 6.7);
        System.out.println("Area = " + rec1.calculateArea());

        // Polymorphism (Person example)
        Person [] people = new Person[5];
        people[0] = new Person();
        people[1] = new Student();
        people[2] = new Teacher();
        people[3] = new Person();
        people[4] = new Student();

        for (Person person : people) {
            person.greet();
        }
    }
}
