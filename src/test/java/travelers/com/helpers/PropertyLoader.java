package travelers.com.helpers;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class PropertyLoader {



    public static Configuration loadProperties () throws ConfigurationException {
        Configurations configurations = new Configurations();
        return  configurations.properties("src//main//resources//test.properties");


    }

    public static void main(String[] args) throws ConfigurationException {
        Configuration configuration = loadProperties();
        System.out.println (configuration.getString("driver"));
        System.out.println (configuration.getBoolean("isDev"));
    }
}
