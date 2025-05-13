import com.google.common.collect.DiscreteDomain;

public class Main {
    public static void main(String[] args) {
        DiscreteDomain<Integer> domain = DiscreteDomain.integers();
        /* write */ DiscreteDomain<Integer> integerDomain = DiscreteDomain.of(domain);
        /* read */ int previousValue = integerDomain.previous(5);
        System.out.println(previousValue);
    }
}