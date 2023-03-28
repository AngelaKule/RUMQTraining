package Classes;
import java.util.ArrayList;
import java.util.List;

public class Person {

    // Attributes
    public String name;
    public Address [] addresses;
    List<Company> companies;
    Car car;
    Bike bike;
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Constructors
    public Person(String name){
        this.name = name;
        System.out.println("The constructor was called for "+ name);
    }

    public Person(String name, Address[] obj){
        this.name = name;
        this.addresses = obj;
    }

    // Getters and Setters
    public String getName (){
        return name;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public void setCar(Car car){
       this.car = car;
    }
    public void setBike(Bike bike) {
        this.bike = bike;
    }

    @Override

    public String toString() {

        String displayAddresses = "";
        for (Address address : addresses) {
            displayAddresses = displayAddresses + address + " ";
        }
        String vehiclesDisplay = "";
        for (Vehicle veh : vehicles) {
            vehiclesDisplay = vehiclesDisplay + veh + " ";
        }

        return "Person{ name='" + name + '\'' 
        + " has addresses = " + displayAddresses 
        + "\n Works at " + companies.get(companies.size()-1).getCompanyName() + 
        " \n Previously worked at " + companies.get(companies.size()-2).getCompanyName() + 
        "\n Drivers a car " + car.getType() + 
        "\n Drives a bike " + bike.getType() +
        "\n Vehicles as listed : " + vehiclesDisplay + 
        "}";  
    }    

    // getPersonArray method, no input, Person output and must be public method

    public static void PersonArray(){
        Person person1 = new Person("Angie");
        Person person2 = new Person("Aina");
        Person [] names = new Person[2];
        names [0] = person1;
        names [1] = person2;
        
    }
    
    public static Person[] getPersonArray(int arraySize){
        Person [] personArray = new Person[arraySize];
        for (int index = 0; index < arraySize; index++) {
            personArray[index] = new Person("Name " + index);
        }
        return personArray;
    }

    // add vehicles method
    public void addVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}