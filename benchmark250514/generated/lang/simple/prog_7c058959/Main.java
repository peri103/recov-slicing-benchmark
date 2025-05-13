import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        /* write */ strBuilder = new StrBuilder(strBuilder.substring(0, 5)); // Extract substring "Hello"
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}