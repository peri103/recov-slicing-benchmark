import java.util.LinkedList;

public class LinkedListOperations {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addLastElement(int value) {
        /* write */ list.addLast(value);
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
