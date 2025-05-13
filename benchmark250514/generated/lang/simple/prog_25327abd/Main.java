import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        /* write */ strBuilder.appendSeparator(", ");
        String result = strBuilder.toString();
        /* read */ System.out.println(result);
    }
}