import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        appConfig.configure("key", "value");

        // Additional code to make the program more complex
        String[] greetings = {"Hello", "Hi", "Hey"};
        for (String greeting : greetings) {
            System.out.println(greeting);
        }

        Properties props = appConfig.getConfigManager().getProps();
        /* read */ String value = props.getProperty("key");
        System.out.println("Config value: " + value);

        // More unrelated code
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}