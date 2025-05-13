import com.google.common.collect.DiscreteDomain;

public class Main {
    public static void main(String[] args) {
        DiscreteDomain<Integer> domain = DiscreteDomain.integers();
        /* write */ Integer value = domain.of(5);
        /* read */ Integer nextValue = domain.next(value);
        System.out.println(nextValue);
    }
}