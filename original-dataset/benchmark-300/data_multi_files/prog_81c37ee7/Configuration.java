import java.util.Properties;

public class Configuration {
    private Properties properties = new Properties();

    public void setProperty(String key, String value) {
        /* write */ properties.setProperty(key, value);
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
