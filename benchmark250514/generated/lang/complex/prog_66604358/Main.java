import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Main {
    public static void main(String[] args) {
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        /* write */ equalsBuilder.append(1, 1);
        hashCodeBuilder.append(1).append(2).append(3);

        int hashCode = hashCodeBuilder.toHashCode();
        System.out.println("Generated HashCode: " + hashCode);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            hashCodeBuilder.append(i);
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        int newHashCode = hashCodeBuilder.toHashCode();
        System.out.println("Updated HashCode: " + newHashCode);

        boolean isEqual = equalsBuilder.isEquals(); /* read */
        System.out.println("Are numbers equal? " + isEqual);

        // Additional logic for complexity
        String str1 = "Hello";
        String str2 = "World";
        EqualsBuilder stringEqualsBuilder = new EqualsBuilder();
        stringEqualsBuilder.append(str1, str2);
        boolean areStringsEqual = stringEqualsBuilder.isEquals();
        System.out.println("Are strings equal? " + areStringsEqual);
    }
}