import org.apache.commons.lang3.builder.CompareToBuilder;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        /* write */ compareToBuilder.append(5, 10);
        /* read */ int comparisonResult = compareToBuilder.toComparison();
        System.out.println(comparisonResult);
    }
}