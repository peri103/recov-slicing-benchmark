import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EqualsBuilder equalsBuilder = new EqualsBuilder();
        HashCodeBuilder hashCodeBuilder = new HashCodeBuilder();

        int a = 5;
        int b = 5;
        int c = 10;

        /* write */ equalsBuilder.append(a, b);

        hashCodeBuilder.append(a);
        hashCodeBuilder.append(c);
        int hashCode1 = hashCodeBuilder.toHashCode();
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        boolean areNumbersEqual = new EqualsBuilder().append(sum, 20).isEquals();
        
        if (areNumbersEqual) {
            System.out.println("Sum of numbers is 20");
        } else {
            System.out.println("Sum of numbers is not 20");
        }

        /* read */ boolean areEqual = equalsBuilder.isEquals();
        System.out.println("Are a and b equal? " + areEqual);

        hashCodeBuilder.append(b);
        int hashCode2 = hashCodeBuilder.toHashCode();

        System.out.println("HashCode1: " + hashCode1);
        System.out.println("HashCode2: " + hashCode2);
    }
}