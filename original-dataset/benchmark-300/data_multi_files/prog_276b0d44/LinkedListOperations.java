import java.util.LinkedList;

public class LinkedListOperations {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addValue(int value) {
        /* write */ list.addLast(value);
    }

    public int getLastValue() {
        return list.getLast();
    }
}
