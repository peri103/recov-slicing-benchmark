import org.apache.commons.lang3.builder.CompareToBuilder;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        /* write */ compareToBuilder.append(1, 1);
        /* read */ int comparisonResult = compareToBuilder.toComparison();
        System.out.println(comparisonResult);
    }
}