import org.jfree.chart.plot.XYPlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        XYPlot plot = new XYPlot();

        // Set up some unrelated configurations
        ValueAxis xAxis = new NumberAxis("X-Axis");
        ValueAxis yAxis = new NumberAxis("Y-Axis");
        plot.setDomainAxis(xAxis);
        plot.setRangeAxis(yAxis);

        // Another unrelated paint setting
        plot.setDomainGridlinePaint(Color.BLUE);

        // Add a loop to perform some calculations
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        System.out.println("Sum of data: " + sum);

        // Set the range gridline paint
        /* write */ plot.setRangeGridlinePaint(Color.RED);

        // Perform some unrelated operations
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteration: " + i);
        }

        // Get and print the range gridline paint
        /* read */ Paint paint = plot.getRangeGridlinePaint();
        System.out.println(paint);

        // Perform another unrelated operation
        double average = sum / data.length;
        System.out.println("Average of data: " + average);
    }
}