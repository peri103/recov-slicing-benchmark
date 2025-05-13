import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;

public class CustomSetBuilder {
    private Builder<String> builder;

    public CustomSetBuilder() {
        builder = ImmutableSet.builder();
    }

    public void addElement(String element) {
        /* write */ builder.add(element);
    }

    public ImmutableSet<String> build() {
        return builder.build();
    }
}
