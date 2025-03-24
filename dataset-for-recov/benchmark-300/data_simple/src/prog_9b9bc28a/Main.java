import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        Properties props = new Properties();
        /* write */ props.setProperty("key", "value");
        /* read */ String value = props.getProperty("key");
        System.out.println(value);
    }
}