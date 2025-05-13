import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");

        // Performing write operation
        /* write */ strBuilder = new StrBuilder(strBuilder.substring(0, 5));

        // Performing read operation
        /* read */ String result = strBuilder.toString();

        System.out.println(result);
    }
}