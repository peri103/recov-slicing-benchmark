import org.apache.commons.lang3.builder.ToStringBuilder;

public class ToStringWriter {
    private ToStringBuilder builder;

    public ToStringWriter() {
        this.builder = new ToStringBuilder(new Object());
    }

    public void appendKeyValue(String key, String value) {
        /* write */ builder.append(key, value);
    }

    public ToStringBuilder getBuilder() {
        return builder;
    }
}
