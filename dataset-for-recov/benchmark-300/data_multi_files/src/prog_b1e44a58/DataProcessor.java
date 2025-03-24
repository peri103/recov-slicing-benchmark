import java.util.ArrayList;

public class DataProcessor {
    private DataStorage storage;

    public DataProcessor(DataStorage storage) {
        this.storage = storage;
    }

    public void processData() {
        // Simulate some data processing
        ArrayList<Integer> data = storage.getData();
        if (!data.isEmpty()) {
            int value = data.get(0);
            System.out.println("Processed Data: " + value);
        }
    }
}
