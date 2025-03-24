public class AppSettings {
    private Configuration config = new Configuration();

    public void initializeSettings() {
        config.setConfig("theme", "dark");
        config.setConfig("language", "en");
    }

    public String getSetting(String key) {
        return config.getConfig(key);
    }
}
