public class ApplicationConfig {
    private ConfigurationManager configManager = new ConfigurationManager();

    public void initializeConfig() {
        configManager.setConfiguration("appName", "MyApplication");
        configManager.setConfiguration("version", "1.0.0");
    }

    public String getAppName() {
        return configManager.getConfiguration("appName");
    }

    public String getVersion() {
        return configManager.getConfiguration("version");
    }
}
