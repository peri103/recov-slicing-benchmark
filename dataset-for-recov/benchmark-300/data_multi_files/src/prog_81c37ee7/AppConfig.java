import java.util.Properties;

public class AppConfig {
    private Properties properties = new Properties();

    public void setConfig(String key, String value) {
        /* write */ properties.setProperty(key, value);
    }

    public String getConfig(String key) {
        return properties.getProperty(key);
    }
}
