import com.google.common.base.Optional;

public class Main {
    public static void main(String[] args) {
        /* write */ Optional<Integer> optionalValue = Optional.of(42);
        /* read */ int value = optionalValue.get();
        System.out.println(value);
    }
}