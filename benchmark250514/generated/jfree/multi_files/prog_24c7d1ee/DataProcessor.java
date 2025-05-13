import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<Integer> data = new ArrayList<>();

    public void addData(int value) {
        data.add(value);
    }

    public int calculateSum() {
        int sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }
}