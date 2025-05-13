import org.apache.commons.lang3.builder.ToStringBuilder;

public class Main {
    public static void main(String[] args) {
        ToStringBuilder builder = new ToStringBuilder("Example");
        /* write */ builder.append("key", "value");
        /* read */ String result = builder.toString();
        System.out.println(result);
    }
}