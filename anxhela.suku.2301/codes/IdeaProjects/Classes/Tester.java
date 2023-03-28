package Classes;
public class Tester {
    public static void  main (String[] args){
        // objects
        Person person1 = new Person("Angie");
        Person person2 = new Person("Aina");

        // method 1
        Person [] names = new Person[2];
        names [0] = person1;
        names [1] = person2;
        System.out.println(names);


        // method 2
        Person[] method2 = new Person[]{person1,person2};
        System.out.println(method2);

        for (Person name :names){
            System.out.println(name.getName());
        }

        // testing the prints
        System.out.println(person1);
        System.out.println("To string : " + person1.toString());
        System.out.println("Hash code : " + person1.hashCode());
        System.out.println("Get Class : " + person1.getClass());
        // Getters
        System.out.println(person1.getName());

        System.out.println(person2);
        System.out.println(person2.getName());

        System.out.println("**** Testing PersonArray()****");
        Person.PersonArray();
        Person.getPersonArray(3);

        System.out.println("**** Testing Address Class()****");
        Address house1 = new Address("123445");
        System.out.println(house1);

        //Person person3 = new Person("Anxhela", house1);
        //System.out.println(person3);

        Address[] obj = new Address[2];
        obj[0] = new Address("09890");
        obj[1] = new Address("3536776");

        String displayAddresses = "";
        for (Address address : obj) {
            displayAddresses = displayAddresses + address;
            
        }

        displayAddresses = displayAddresses.substring(0,displayAddresses.length()-1);
        System.out.println(displayAddresses);
        
        Person person3 = new Person("Anxhela", obj);
        System.out.println(person3);

        System.out.println("*** Company Tester ***");
        
    }
}
