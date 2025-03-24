public class AppConfig {
    private ConfigManager configManager = new ConfigManager();

    public void configure(String key, String value) {
        configManager.setConfig(key, value);
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }
}
