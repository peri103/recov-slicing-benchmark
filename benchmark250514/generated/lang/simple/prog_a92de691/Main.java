import org.apache.commons.lang3.builder.CompareToBuilder;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder builder = new CompareToBuilder();
        /* write */ builder.append(5, 3);
        /* read */ int comparisonResult = builder.toComparison();
        System.out.println(comparisonResult);
    }
}