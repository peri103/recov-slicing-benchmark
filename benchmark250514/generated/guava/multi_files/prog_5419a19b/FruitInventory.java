import com.google.common.collect.ImmutableMultiset;

public class FruitInventory {
    private ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();

    public void addFruits() {
        /* write */ builder.add("apple").add("banana").add("apple");
    }

    public ImmutableMultiset<String> buildInventory() {
        return builder.build();
    }
}
