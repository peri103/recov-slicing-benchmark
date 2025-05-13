import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        
        // Setting up some sample data for comparison
        int lhs = 5;
        int rhs = 10;

        /* write */ compareToBuilder.append(lhs, rhs);
        
        // Additional complex operations
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        boolean isEqual = equalsBuilder.append(lhs, rhs).isEquals();
        
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();
        int hashCode = hashCodeBuilder.append(lhs).append(rhs).toHashCode();
        
        // Printing additional results
        System.out.println("Equality: " + isEqual);
        System.out.println("HashCode: " + hashCode);
        
        // Further operations with CompareToBuilder
        CompareToBuilder anotherCompareToBuilder = new CompareToBuilder();
        anotherCompareToBuilder.append(rhs, lhs);
        int anotherComparisonResult = anotherCompareToBuilder.toComparison();
        
        System.out.println("Another Comparison Result: " + anotherComparisonResult);
        
        // Performing calculations and logical operations
        int sum = lhs + rhs;
        boolean isGreater = lhs > rhs;
        
        System.out.println("Sum: " + sum);
        System.out.println("Is LHS greater than RHS? " + isGreater);
        
        /* read */ int comparisonResult = compareToBuilder.toComparison();
        
        System.out.println("Original Comparison Result: " + comparisonResult);
        
        // More unrelated operations
        int product = lhs * rhs;
        int difference = rhs - lhs;
        
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
    }
}