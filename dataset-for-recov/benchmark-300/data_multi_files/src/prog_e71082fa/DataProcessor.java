import java.util.LinkedList;

public class DataProcessor {
    private LinkedList<Integer> data = new LinkedList<>();

    public void addData(int value) {
        /* write */ data.addLast(value);
    }

    public LinkedList<Integer> getData() {
        return data;
    }
}
