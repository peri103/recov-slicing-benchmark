import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Initial String");
        /* write */ strBuilder.clear();
        /* read */ String result = strBuilder.toString();
        System.out.println("Result after clear: '" + result + "'");
    }
}