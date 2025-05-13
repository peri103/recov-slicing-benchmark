import com.google.common.collect.ImmutableList;

public class CustomListReader {
    private ImmutableList<Integer> list;

    public CustomListReader(ImmutableList<Integer> list) {
        this.list = list;
    }

    public int getElement(int index) {
        /* read */ return list.get(index);
    }
}
