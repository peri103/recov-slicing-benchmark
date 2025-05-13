import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

public class DomainOperations {
    private DiscreteDomain<Integer> domain;

    public DomainOperations() {
        domain = DiscreteDomain.integers();
    }

    public DiscreteDomain<Integer> getDomain() {
        return domain;
    }

    public void performOperations() {
        // Additional operations
        Range<Integer> range = Range.closed(1, 10);
        boolean containsFive = range.contains(5);
        System.out.println("Range contains 5: " + containsFive);

        Range<Integer> intersectionRange = range.intersection(Range.closed(5, 15));
        System.out.println("Intersection of ranges: " + intersectionRange);

        Range<Integer> spanRange = range.span(Range.closed(8, 20));
        System.out.println("Span of ranges: " + spanRange);

        Range<Integer> complementRange = Range.all().difference(range);
        System.out.println("Complement of range: " + complementRange);

        boolean isConnected = range.isConnected(Range.closed(11, 20));
        System.out.println("Is connected to range [11, 20]: " + isConnected);
    }
}
