import java.util.LinkedList;

public class DataProcessor {
    private LinkedList<Integer> data = new LinkedList<>();

    public void addData(int value) {
        /* write */ data.addFirst(value);
    }

    public LinkedList<Integer> getData() {
        return data;
    }
}
