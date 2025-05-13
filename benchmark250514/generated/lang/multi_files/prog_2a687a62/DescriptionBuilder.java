import org.apache.commons.lang3.builder.ToStringBuilder;

public class DescriptionBuilder {
    private ToStringBuilder builder;

    public DescriptionBuilder(Object obj) {
        builder = new ToStringBuilder(obj);
    }

    public void appendDescription(String key, String value) {
        /* write */ builder.append(key, value);
    }

    public String buildDescription() {
        /* read */ return builder.toString();
    }
}
