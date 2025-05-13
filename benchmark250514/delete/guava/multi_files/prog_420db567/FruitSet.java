import com.google.common.collect.ImmutableSet;

public class FruitSet {
    private ImmutableSet.Builder<String> setBuilder = ImmutableSet.builder();

    public void addFruit(String fruit) {
        setBuilder.add(fruit);
    }

    public ImmutableSet<String> buildSet() {
        return setBuilder.build();
    }
}
