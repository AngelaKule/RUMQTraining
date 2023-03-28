package Classes;
public class Car extends Vehicle{
   
    // Constructors
   
    public Car(String model, String make, String type){
        this.model = model;
        this.make = make;
        this.type = type;
    }

    public String getType(){
        return "This car is a type of : " + type;
    }

    public String getType(String something){
        return something;
    }

}
