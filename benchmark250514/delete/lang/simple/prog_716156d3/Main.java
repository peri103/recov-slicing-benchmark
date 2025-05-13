import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World!");
        /* write */ StrBuilder substringBuilder = strBuilder.substring(0, 5);
        /* read */ String value = substringBuilder.toString();
        System.out.println(value);
    }
}