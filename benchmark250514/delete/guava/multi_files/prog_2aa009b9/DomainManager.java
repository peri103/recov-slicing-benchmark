import com.google.common.collect.DiscreteDomain;

public class DomainManager {
    private DiscreteDomain<Integer> integerDomain;

    public DomainManager(DomainOperations operations) {
        /* write */ integerDomain = DiscreteDomain.of(operations.getDomain());
    }

    public int getPreviousValue(int value) {
        /* read */ return integerDomain.previous(value);
    }
}
