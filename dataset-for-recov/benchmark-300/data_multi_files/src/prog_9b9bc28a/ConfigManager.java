import java.util.Properties;

public class ConfigManager {
    private Properties props = new Properties();

    public void setConfig(String key, String value) {
        /* write */ props.setProperty(key, value);
    }

    public Properties getProps() {
        return props;
    }
}
