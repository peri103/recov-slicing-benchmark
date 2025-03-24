import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        /* write */ properties.setProperty("key", "value");
        /* read */ String value = properties.getProperty("key");
        System.out.println(value);
    }
}