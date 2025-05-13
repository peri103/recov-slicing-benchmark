import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World!");
        /* write */ strBuilder.deleteFirst('H');
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}