import com.google.common.collect.ImmutableMultiset;

public class FruitMultiset {
    private ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();

    public void addFruit(String fruit) {
        /* write */ builder.add(fruit);
    }

    public ImmutableMultiset<String> buildMultiset() {
        return builder.build();
    }
}
