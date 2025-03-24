import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    private List<Integer> list = new ArrayList<>();

    public void add(int value) {
        list.add(value);
    }

    public int get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }
}
