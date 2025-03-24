import java.util.LinkedList;

public class DataStorage {
    private LinkedList<Integer> data = new LinkedList<>();

    public void storeData(int value) {
        /* write */ data.addLast(value);
    }

    public int retrieveData() {
        /* read */ return data.getLast();
    }
}
