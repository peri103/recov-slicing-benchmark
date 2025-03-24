public class UserProfile {
    private String username;
    private ConfigurationManager configManager = new ConfigurationManager();

    public UserProfile(String username) {
        this.username = username;
    }

    public void setUserConfiguration(String key, String value) {
        configManager.setConfiguration(key, value);
    }

    public String getConfiguration(String key) {
        return configManager.getProperties().getProperty(key);
    }
}
