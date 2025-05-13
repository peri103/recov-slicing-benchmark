import java.util.ArrayList;
import java.util.List;

public class DataAnalyzer {
    private List<Integer> dataValues = new ArrayList<>();

    public void addDataValue(int value) {
        dataValues.add(value);
    }

    public int calculateSum() {
        int sum = 0;
        for (int value : dataValues) {
            sum += value;
        }
        return sum;
    }

    public List<Integer> getDataValues() {
        return dataValues;
    }
}
