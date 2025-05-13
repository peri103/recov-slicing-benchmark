import com.google.common.collect.DiscreteDomain;

public class Main {
    public static void main(String[] args) {
        DiscreteDomain<Integer> integerDomain = DiscreteDomain.integers();
        int value = 5;
        /* write */ DiscreteDomain<Integer> domainWithValue = DiscreteDomain.of(value);
        /* read */ int nextValue = domainWithValue.next(value);
        System.out.println(nextValue);
    }
}