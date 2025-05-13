import org.apache.commons.lang3.builder.ToStringBuilder;

public class ToStringReader {
    private ToStringBuilder builder;

    public ToStringReader(ToStringBuilder builder) {
        this.builder = builder;
    }

    public String readToString() {
        /* read */ return builder.toString();
    }
}
