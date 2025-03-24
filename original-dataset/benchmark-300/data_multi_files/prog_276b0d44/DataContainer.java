import java.util.LinkedList;

public class DataContainer {
    private LinkedList<Integer> data = new LinkedList<>();

    public void addData(int value) {
        /* write */ data.addLast(value);
    }

    public int getLastData() {
        return data.getLast();
    }
}
