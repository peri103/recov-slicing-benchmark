import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.data.Range;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ValueAxis
        ValueAxis axis = new NumberAxis();
        
        // Define the range to be set
        Range rangeToSet = new Range(0.0, 100.0);
        
        // Write operation: set the range
        /* write */ axis.setRange(rangeToSet);

        // Create a dataset and add some data
        XYSeries series = new XYSeries("Data");
        for (int i = 0; i <= 100; i += 10) {
            series.add(i, i * 2);
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Sample Chart", "X", "Y", dataset
        );

        // Create a plot and set the axis
        Plot plot = new XYPlot();
        if (plot instanceof XYPlot) {
            XYPlot xyPlot = (XYPlot) plot;
            xyPlot.setDomainAxis(axis);
        }

        // Perform some operations on the plot
        for (int i = 0; i < 10; i++) {
            double xValue = series.getX(i).doubleValue();
            double yValue = series.getY(i).doubleValue();
            System.out.println("Point: (" + xValue + ", " + yValue + ")");
        }

        // Read operation: get the range
        /* read */ Range rangeRead = axis.getRange();
        
        // Output the range to verify the read value is the same as the written value
        System.out.println("Range: " + rangeRead.getLowerBound() + " to " + rangeRead.getUpperBound());

        // Perform additional operations on the dataset
        XYSeries newSeries = new XYSeries("New Data");
        for (int i = 0; i <= 50; i += 5) {
            newSeries.add(i, i * 3);
        }
        dataset.addSeries(newSeries);

        // Output additional data points
        for (int i = 0; i < newSeries.getItemCount(); i++) {
            double xValue = newSeries.getX(i).doubleValue();
            double yValue = newSeries.getY(i).doubleValue();
            System.out.println("New Point: (" + xValue + ", " + yValue + ")");
        }
    }
}