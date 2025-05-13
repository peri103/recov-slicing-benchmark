import com.google.common.collect.DiscreteDomain;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiscreteDomain for integers
        DiscreteDomain<Integer> integerDomain = DiscreteDomain.integers();
        
        // Use the 'of' method to get a DiscreteDomain instance
        /* write */ DiscreteDomain<Integer> domain = DiscreteDomain.of(integerDomain);

        // Use the 'previous' method to get the previous integer of a given value
        /* read */ int previousValue = domain.previous(5);

        // Print the result
        System.out.println(previousValue);
    }
}