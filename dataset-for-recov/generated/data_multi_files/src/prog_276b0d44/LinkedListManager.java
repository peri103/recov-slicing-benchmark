import java.util.LinkedList;

public class LinkedListManager {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addToEnd(int value) {
        /* write */ list.addLast(value);
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
