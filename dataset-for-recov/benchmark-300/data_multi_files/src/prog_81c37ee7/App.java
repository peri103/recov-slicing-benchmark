public class App {
    private Configuration config = new Configuration();

    public void initializeConfig() {
        config.setConfig("key", "value");
    }

    public String retrieveConfig() {
        return config.getConfig("key");
    }
}
