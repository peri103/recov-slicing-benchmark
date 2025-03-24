import java.util.LinkedList;

public class LinkedListData {
    private LinkedList<Integer> data = new LinkedList<>();

    public void addFirst(int value) {
        /* write */ data.addFirst(value);
    }

    public int getFirst() {
        return data.getFirst();
    }
}
