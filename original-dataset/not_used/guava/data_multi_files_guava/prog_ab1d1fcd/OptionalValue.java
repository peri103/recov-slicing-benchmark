import com.google.common.base.Optional;

public class OptionalValue {
    private Optional<Integer> optionalValue;

    public OptionalValue(int value) {
        /* write */ optionalValue = Optional.of(value);
    }

    public Optional<Integer> getOptionalValue() {
        return optionalValue;
    }
}
