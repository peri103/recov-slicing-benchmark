import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        /* write */ strBuilder.append("Hello, World!");
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}