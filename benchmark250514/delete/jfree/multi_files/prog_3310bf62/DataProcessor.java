import java.util.ArrayList;

public class DataProcessor {
    private ArrayList<Double> values;

    public DataProcessor() {
        values = new ArrayList<>();
    }

    public void addValue(double value) {
        values.add(value);
    }

    public double calculateSum() {
        double sum = 0.0;
        for (Double value : values) {
            sum += value;
        }
        return sum;
    }

    public double findMaxValue() {
        double maxValue = Double.MIN_VALUE;
        for (Double value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public ArrayList<Double> getTransformedValues() {
        ArrayList<Double> transformedValues = new ArrayList<>();
        for (Double value : values) {
            transformedValues.add(value * 2);
        }
        return transformedValues;
    }
}
