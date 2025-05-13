import org.apache.commons.lang3.builder.CompareToBuilder;

public class ComparisonUtil {
    private CompareToBuilder compareToBuilder = new CompareToBuilder();

    public void appendValues(int value1, int value2) {
        /* write */ compareToBuilder.append(value1, value2);
    }

    public int getComparisonResult() {
        /* read */ return compareToBuilder.toComparison();
    }
}