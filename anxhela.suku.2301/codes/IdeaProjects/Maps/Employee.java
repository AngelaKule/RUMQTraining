
package Maps;

public class Employee {

    // attributes
    String name;

    // Constructor
    public Employee(String name){
        this.name = name;
    }

    // String
    @Override
    public String toString() {
        return name;
    }
}