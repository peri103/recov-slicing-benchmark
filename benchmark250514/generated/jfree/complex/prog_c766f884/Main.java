import org.jfree.chart.plot.CombinedRangeXYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize a CombinedRangeXYPlot object
        CombinedRangeXYPlot plot = new CombinedRangeXYPlot();

        // Create a ValueAxis object to be set in the plot
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        // Create a dataset for demonstration
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        XYDataset dataset = new XYSeriesCollection(series);

        // Create an XYPlot with the dataset
        XYPlot subPlot = new XYPlot(dataset, null, rangeAxis, null);

        // Add the subplot to the combined plot
        plot.add(subPlot);

        // Set the range axis
        /* write */ plot.setRangeAxis(rangeAxis);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More complex data manipulation
        for (int i = 0; i < series.getItemCount(); i++) {
            System.out.println("X: " + series.getX(i) + ", Y: " + series.getY(i));
        }

        // Retrieve and verify the range axis
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();

        // Print out the label of the retrieved axis to verify
        System.out.println(retrievedAxis.getLabel());

        // Additional unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}