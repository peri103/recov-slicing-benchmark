import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello");
        /* write */ strBuilder.appendSeparator(", ");
        strBuilder.append("World");
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}