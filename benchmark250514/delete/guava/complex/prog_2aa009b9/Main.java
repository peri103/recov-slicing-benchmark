import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        DiscreteDomain<Integer> domain = DiscreteDomain.integers();
        
        // Additional code to create a range and perform operations
        Range<Integer> range = Range.closed(1, 10);
        boolean containsFive = range.contains(5);
        System.out.println("Range contains 5: " + containsFive);

        // More operations on the range
        Range<Integer> intersectionRange = range.intersection(Range.closed(5, 15));
        System.out.println("Intersection of ranges: " + intersectionRange);

        // Using the original write method
        /* write */ DiscreteDomain<Integer> integerDomain = DiscreteDomain.of(domain);

        // Perform operations with additional range
        Range<Integer> spanRange = range.span(Range.closed(8, 20));
        System.out.println("Span of ranges: " + spanRange);

        // Using the original read method
        /* read */ int previousValue = integerDomain.previous(5);
        System.out.println("Previous value: " + previousValue);

        // Further manipulate the range
        Range<Integer> complementRange = Range.all().difference(range);
        System.out.println("Complement of range: " + complementRange);

        // Final operations to make the program more complex
        boolean isConnected = range.isConnected(Range.closed(11, 20));
        System.out.println("Is connected to range [11, 20]: " + isConnected);
    }
}