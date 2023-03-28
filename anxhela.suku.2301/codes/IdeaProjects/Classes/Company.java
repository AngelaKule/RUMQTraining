package Classes;
public class Company {

    // Attributes
    String companyName;

    // Getters and Setters
    public String getCompanyName(){
        return companyName;
    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    // Constructors
    public Company(String companyName){
        this.companyName = companyName;
    }

    public Company(){
        this.companyName = "Microsoft";
    }


    @Override

    public String toString(){
        return companyName + " Company";
    }
}
