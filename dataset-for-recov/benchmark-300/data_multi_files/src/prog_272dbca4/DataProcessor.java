import java.util.Vector;

public class DataProcessor {
    private DataStorage storage;

    public DataProcessor(DataStorage storage) {
        this.storage = storage;
    }

    public void processData() {
        Vector<Integer> data = storage.getData();
        /* read */ int value = data.get(0);
        System.out.println("Processed value: " + value);
    }
}
