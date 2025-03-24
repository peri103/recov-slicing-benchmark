import java.util.LinkedList;

public class DataReader {
    private LinkedList<Integer> list;

    public DataReader(LinkedList<Integer> list) {
        this.list = list;
    }

    public int readData() {
        /* read */ return list.getLast();
    }
}
