public class Student {
    private String name;
    private ConfigurationManager configManager = new ConfigurationManager();

    public Student(String name) {
        this.name = name;
    }

    public void setConfig(String key, String value) {
        configManager.setProperty(key, value);
    }

    public String getConfig(String key) {
        return configManager.getProperty(key);
    }
}
