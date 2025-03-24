import java.util.LinkedList;

public class DataWriter {
    private LinkedList<Integer> list;

    public DataWriter(LinkedList<Integer> list) {
        this.list = list;
    }

    public void writeData(int value) {
        /* write */ list.addLast(value);
    }
}
