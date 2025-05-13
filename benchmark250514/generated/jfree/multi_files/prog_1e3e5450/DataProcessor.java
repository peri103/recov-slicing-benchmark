import java.util.ArrayList;

public class DataProcessor {
    private ArrayList<Double> dataPoints;

    public DataProcessor() {
        this.dataPoints = new ArrayList<>();
    }

    public void addDataPoint(double point) {
        dataPoints.add(point);
    }

    public double calculateAverage() {
        double sum = 0.0;
        for (Double point : dataPoints) {
            sum += point;
        }
        return sum / dataPoints.size();
    }

    public ArrayList<Double> transformDataPoints() {
        ArrayList<Double> transformedDataPoints = new ArrayList<>();
        for (Double point : dataPoints) {
            transformedDataPoints.add(point * 2);
        }
        return transformedDataPoints;
    }
}
