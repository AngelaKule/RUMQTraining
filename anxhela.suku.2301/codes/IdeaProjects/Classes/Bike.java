package Classes;
public class Bike extends Vehicle{

    // Constructors 
    public Bike(String model, String make, String type){
        this.model = model;
        this.make = make;
        this.type = type;
    }

    public String getType(){
        return "This bike is a type of : " + type;
    }
}
