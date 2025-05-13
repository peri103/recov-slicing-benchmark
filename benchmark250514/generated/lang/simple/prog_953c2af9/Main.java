import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        /* write */ strBuilder.replace(6, 11, "Java");
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}