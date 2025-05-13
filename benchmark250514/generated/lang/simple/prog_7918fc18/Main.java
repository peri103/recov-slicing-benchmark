import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello, World!");

        /* write */ strBuilder.substring(0, 5); // The substring method is used here but does not modify the original StrBuilder object

        /* read */ String value = strBuilder.toString();
        System.out.println(value); // Output should be "Hello, World!" since substring does not alter the StrBuilder object
    }
}