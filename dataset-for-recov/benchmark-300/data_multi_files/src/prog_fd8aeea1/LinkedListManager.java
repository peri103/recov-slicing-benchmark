import java.util.LinkedList;

public class LinkedListManager {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addToList(int value) {
        list.add(value);
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
