import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ValueAxis axis = new NumberAxis();
        Range newRange = new Range(0.0, 10.0);

        ArrayList<Double> dataPoints = new ArrayList<>();
        for (double i = 0.0; i <= 10.0; i += 0.5) {
            dataPoints.add(i);
        }
        
        /* write */ axis.setRange(newRange);

        double sum = 0.0;
        for (Double point : dataPoints) {
            sum += point;
        }
        double average = sum / dataPoints.size();
        System.out.println("Average of data points: " + average);

        Range anotherRange = new Range(5.0, 15.0);
        axis.setRange(anotherRange);
        System.out.println("Another Range: " + axis.getRange());

        /* read */ Range range = axis.getRange();
        System.out.println("Range: " + range);

        ArrayList<Double> transformedDataPoints = new ArrayList<>();
        for (Double point : dataPoints) {
            transformedDataPoints.add(point * 2);
        }

        System.out.println("Transformed Data Points:");
        for (Double point : transformedDataPoints) {
            System.out.println(point);
        }
    }
}