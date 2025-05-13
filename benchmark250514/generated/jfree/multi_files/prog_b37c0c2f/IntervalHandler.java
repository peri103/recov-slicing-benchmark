import org.jfree.chart.plot.IntervalMarker;
import java.util.ArrayList;

public class IntervalHandler {
    private IntervalMarker intervalMarker;
    private ArrayList<Double> intervalValues;

    public IntervalHandler(double start, double end) {
        intervalMarker = new IntervalMarker(start, end);
        intervalValues = new ArrayList<>();
        intervalValues.add(start);
        intervalValues.add(end);
    }

    public double calculateIntervalLength() {
        return intervalMarker.getEndValue() - intervalMarker.getStartValue();
    }

    public double calculateSumOfIntervalValues() {
        double sum = 0;
        for (double val : intervalValues) {
            sum += val;
        }
        return sum;
    }

    public void updateIntervalValues(double start, double end) {
        intervalMarker.setStartValue(start);
        intervalMarker.setEndValue(end);
        intervalValues.set(0, start);
        intervalValues.set(1, end);
    }
}