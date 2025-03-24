import java.util.LinkedList;

public class LinkedListOperations {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addToLast(int value) {
        /* write */ list.addLast(value);
    }

    public int getLastValue() {
        return list.getLast();
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
