import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        /* write */ strBuilder.substring(0, 5); // This operation doesn't modify the original StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}