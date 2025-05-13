import com.google.common.collect.ImmutableSet;

public class DataProcessor {
    private ImmutableSet<String> dataSet;

    public DataProcessor(CustomSetBuilder builder) {
        this.dataSet = builder.build();
    }

    public boolean containsElement(String element) {
        /* read */ return dataSet.contains(element);
    }
}
