import java.util.LinkedList;

public class LinkedListData {
    private LinkedList<Integer> data = new LinkedList<>();

    public void addData(int value) {
        /* write */ data.add(value);
    }

    public LinkedList<Integer> getData() {
        return data;
    }
}
