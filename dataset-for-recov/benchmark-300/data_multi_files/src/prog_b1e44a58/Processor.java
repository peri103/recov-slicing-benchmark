import java.util.ArrayList;

public class Processor {
    private DataStorage storage;

    public Processor(DataStorage storage) {
        this.storage = storage;
    }

    public void processData() {
        ArrayList<Integer> data = storage.getData();
        /* read */ int value = data.get(0);
        System.out.println("Processed value: " + value);
    }
}
