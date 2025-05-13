import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        /* write */ strBuilder.replace(0, 5, "Hi");
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}