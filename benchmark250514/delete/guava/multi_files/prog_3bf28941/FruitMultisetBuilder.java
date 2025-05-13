import com.google.common.collect.ImmutableMultiset;

public class FruitMultisetBuilder {
    private ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();

    public void addFruits() {
        /* write */ builder.add("apple").add("banana").add("apple");
    }

    public ImmutableMultiset<String> build() {
        return builder.build();
    }
}
