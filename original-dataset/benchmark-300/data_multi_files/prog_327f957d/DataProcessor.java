import java.util.LinkedList;

public class DataProcessor {
    private DataStorage storage;

    public DataProcessor(DataStorage storage) {
        this.storage = storage;
    }

    public void processData() {
        LinkedList<Integer> data = storage.getData();
        if (!data.isEmpty()) {
            /* read */ int value = data.get(0);
            System.out.println("Processed value: " + value);
        }
    }
}
