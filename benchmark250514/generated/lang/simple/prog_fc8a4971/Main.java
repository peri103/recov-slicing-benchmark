import org.apache.commons.lang3.builder.CompareToBuilder;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        
        // Setting up some sample data
        int lhs = 5;
        int rhs = 10;

        /* write */ compareToBuilder.append(lhs, rhs);
        
        /* read */ int comparisonResult = compareToBuilder.toComparison();
        
        System.out.println(comparisonResult);
    }
}