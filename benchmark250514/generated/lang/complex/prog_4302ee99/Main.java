import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(20);

        EqualsBuilder equalsBuilder = new EqualsBuilder();
        boolean isEqual = equalsBuilder.append(numbers.get(0), numbers.get(1)).isEquals();
        System.out.println("Equality check between first two numbers: " + isEqual);

        /* write */ compareToBuilder.append(numbers.get(0), numbers.get(1));
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                System.out.println("Even number found: " + numbers.get(i));
            }
        }

        /* read */ int result = compareToBuilder.toComparison();
        System.out.println("Comparison result between first two numbers: " + result);

        for (int i = 1; i < numbers.size(); i++) {
            equalsBuilder.append(numbers.get(i - 1), numbers.get(i));
            System.out.println("Comparison between " + numbers.get(i - 1) + " and " + numbers.get(i) + ": " + equalsBuilder.isEquals());
        }
    }
}