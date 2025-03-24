import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<Integer> processedData = new ArrayList<>();

    public void processData(int value) {
        processedData.add(value * 2);
    }

    public List<Integer> getProcessedData() {
        return processedData;
    }
}
