import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create an instance of NumberAxis which is a subclass of ValueAxis
        ValueAxis axis = new NumberAxis();

        // Define the range to be set
        Range rangeToSet = new Range(0.0, 100.0);

        // Write operation: Set the range on the axis
        /* write */ axis.setRange(rangeToSet);

        // Create a dataset for a chart
        XYSeries series = new XYSeries("Series1");
        for (int i = 0; i <= 10; i++) {
            series.add(i, i * i);
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a renderer and plot
        XYItemRenderer renderer = new StandardXYItemRenderer();
        XYPlot plot = new XYPlot(dataset, axis, new NumberAxis("Y-Axis"), renderer);

        // Perform some operations on the plot
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);

        // Retrieve the axis range and print it
        /* read */ Range retrievedRange = axis.getRange();
        System.out.println("Retrieved Range: " + retrievedRange);

        // Modify the plot further
        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);

        // Add more data to the series
        series.add(11, 121);
        series.add(12, 144);

        // Print the series data
        for (int i = 0; i < series.getItemCount(); i++) {
            System.out.println("X: " + series.getX(i) + ", Y: " + series.getY(i));
        }
    }
}