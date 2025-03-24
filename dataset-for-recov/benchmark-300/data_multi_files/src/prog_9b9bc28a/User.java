public class User {
    private String name;
    private ConfigManager configManager = new ConfigManager();

    public User(String name) {
        this.name = name;
    }

    public void setConfig(String key, String value) {
        configManager.setConfig(key, value);
    }

    public String getConfig(String key) {
        return configManager.getConfig(key);
    }
}
