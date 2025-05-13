import com.google.common.collect.ImmutableList;

public class ImmutableListBuilder {
    private ImmutableList.Builder<Integer> builder = ImmutableList.builder();

    public void addElement(int element) {
        /* write */ builder.add(element);
    }

    public ImmutableList<Integer> buildList() {
        return builder.build();
    }
}
