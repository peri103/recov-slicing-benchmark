import java.util.LinkedList;

public class LinkedListWrapper {
    private LinkedList<Integer> list = new LinkedList<>();

    public void addValue(int value) {
        /* write */ list.addLast(value);
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
