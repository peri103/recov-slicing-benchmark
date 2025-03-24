import java.util.concurrent.CopyOnWriteArrayList;

public class Processor {
    private DataStorage storage;

    public Processor(DataStorage storage) {
        this.storage = storage;
    }

    public void processData() {
        CopyOnWriteArrayList<Integer> data = storage.getData();
        if (!data.isEmpty()) {
            /* read */ int value = data.get(0);
            System.out.println("Processed value: " + value);
        }
    }
}
