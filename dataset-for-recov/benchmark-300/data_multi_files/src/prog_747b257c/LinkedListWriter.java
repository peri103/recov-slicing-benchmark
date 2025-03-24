import java.util.LinkedList;

public class LinkedListWriter {
    private LinkedList<Integer> list;

    public LinkedListWriter() {
        list = new LinkedList<>();
    }

    public void addValue(int value) {
        /* write */ list.add(value);
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
