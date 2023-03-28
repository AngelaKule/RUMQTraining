package Collections;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;;

public class PropertiesA {
    
    public static void main(String[] args) throws IOException {
        
        // **************   Try out creating properties object, writing it to a file, and reading it back. **********

        // Step 1 : Creat properties object
        var propertiesObj = new Properties();

        // Step 2 : Set Properties 
        propertiesObj.setProperty("Database", "Aurora PostgreSQL");
        propertiesObj.setProperty("username", "ec2_user");

        // Step 3 : Write on the file
        File pFile = new File("myConfig.properties");
        var writer = new FileWriter(pFile);
        propertiesObj.store(writer, "My Configurations");

        // Step 4 : Read the file
        var pObj = new Properties();
        var reader = new FileReader(pFile);
        pObj.load(reader);

        System.out.println(pObj.getProperty("Database"));
        System.out.println(pObj.getProperty("username"));
        
        

        
    }
}
