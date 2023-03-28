package Classes;
public class Address {
    
    // Attributes
    String houseNumber;
    
    // Constructor
    public Address(String houseNumber){
        this.houseNumber = houseNumber;
    }

    // Getters and Setters
    public String gethouseNumber(){
        return houseNumber;
    }

    public void sethouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "House Number "  + houseNumber;
    }
}
