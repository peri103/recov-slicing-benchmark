import org.jfree.data.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ChartRange chartRange = new ChartRange();
        DataProcessor dataProcessor = new DataProcessor();

        for (double i = 0.0; i <= 10.0; i += 0.5) {
            dataProcessor.addDataPoint(i);
        }

        chartRange.setAxisRange(0.0, 10.0);

        double average = dataProcessor.calculateAverage();
        System.out.println("Average of data points: " + average);

        Range anotherRange = new Range(5.0, 15.0);
        chartRange.setAxisRange(anotherRange.getLowerBound(), anotherRange.getUpperBound());
        System.out.println("Another Range: " + chartRange.getAxisRange());

        /* read */ Range range = chartRange.getAxisRange();
        System.out.println("Range: " + range);

        ArrayList<Double> transformedDataPoints = dataProcessor.transformDataPoints();
        System.out.println("Transformed Data Points:");
        for (Double point : transformedDataPoints) {
            System.out.println(point);
        }
    }
}