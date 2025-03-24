import java.util.Vector;

public class DataProcessor {
    private Vector<Integer> data;

    public DataProcessor(Vector<Integer> data) {
        this.data = data;
    }

    public int processData() {
        /* read */ int value = data.elementAt(0);
        return value * 2; // Example processing
    }
}
