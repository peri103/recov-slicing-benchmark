import java.util.Properties;

public class ConfigurationManager {
    private Properties properties = new Properties();

    public void setConfiguration(String key, String value) {
        /* write */ properties.setProperty(key, value);
    }

    public String getConfiguration(String key) {
        return properties.getProperty(key);
    }
}
