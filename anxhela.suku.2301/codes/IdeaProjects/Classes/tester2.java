package Classes;
import java.util.ArrayList;
import java.util.List;

public class tester2 {
    public static void main(String[] args) {
        // address
        Address[] obj = new Address[2];
        obj[0] = new Address("09890");
        obj[1] = new Address("3536776");

        // companies
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Amazon"));
        companies.add(new Company("Alexa"));

        // trying Polymorphism
        Car car2  = new Car("Atlas", "VW", "SUV");
        Bike bike2 = new Bike("D", "F", "electric");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car2);
        vehicles.add(bike2);

        Car car1  = new Car("Jetta", "VW", "sedan");
        Bike bike1 = new Bike("A", "B", "electric");
        Person person1 = new Person("Anxhela", obj);
        // companies
        person1.setCompanies(companies);
        // car
        person1.setCar(car1);
        // bike
        person1.setBike(bike1);
        // vehicle
        person1.addVehicles(vehicles);
        System.out.println(person1);

        
        System.out.println(bike1.getType());

        // overloading getType Methods
        System.out.println(car1.getType());
        System.out.println(car1.getType("Just print"));


        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

    }
}
