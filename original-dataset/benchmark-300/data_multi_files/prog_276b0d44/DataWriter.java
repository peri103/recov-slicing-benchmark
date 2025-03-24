import java.util.LinkedList;

public class DataWriter {
    private LinkedList<Integer> list = new LinkedList<>();

    public void writeData(int value) {
        /* write */ list.addLast(value);
    }

    public LinkedList<Integer> getList() {
        return list;
    }
}
