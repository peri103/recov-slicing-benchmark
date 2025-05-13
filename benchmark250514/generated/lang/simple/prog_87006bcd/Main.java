import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder builder = new StrBuilder();
        /* write */ builder.appendSeparator(",");
        /* read */ String result = builder.toString();
        System.out.println(result);
    }
}