public class Application {
    private ConfigurationManager configManager = new ConfigurationManager();

    public void configure(String key, String value) {
        configManager.setConfiguration(key, value);
    }

    public String getConfiguration(String key) {
        return configManager.getConfiguration(key);
    }
}
