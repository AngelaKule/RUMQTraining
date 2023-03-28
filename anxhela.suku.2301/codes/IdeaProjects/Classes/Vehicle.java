package Classes;
public abstract class Vehicle {
    
    // attributes
    String model;
    String make;
    String type;

    // Getters and Setters

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
