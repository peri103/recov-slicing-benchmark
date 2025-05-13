import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        /* write */ StrBuilder result = strBuilder.substring(0, 5);
        /* read */ String value = result.toString();
        System.out.println(value);
    }
}