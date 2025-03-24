import java.util.LinkedList;

public class LinkedListManager {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addFirst(int value) {
        /* write */ list.addFirst(value);
    }

    public int getFirst() {
        return list.getFirst();
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
