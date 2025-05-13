import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object with a simple XY plot
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 2.0);
        series.add(2.0, 3.0);
        series.add(3.0, 2.5);
        
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        XYPlot plot = new XYPlot(dataset, new NumberAxis("X"), new NumberAxis("Y"), new XYLineAndShapeRenderer(true, false));
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Create a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(chart);
        
        // Use the write method to set the chart
        /* write */ chartPanel.setChart(chart);
        
        // Additional unrelated complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);
        
        String description = "This is a chart panel containing a chart with a simple dataset.";
        System.out.println(description);
        
        // Perform some operations on the plot
        Plot currentPlot = chart.getPlot();
        if (currentPlot instanceof XYPlot) {
            XYPlot xyPlot = (XYPlot) currentPlot;
            xyPlot.setDomainGridlinesVisible(true);
            xyPlot.setRangeGridlinesVisible(true);
        }
        
        // Use the read method to get the chart
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();
        
        // Print the result to verify the read operation
        System.out.println("Chart retrieved: " + (retrievedChart == chart));
        
        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);
        
        // Modify the series and update the dataset
        series.add(4.0, 3.5);
        dataset.addSeries(series);
        System.out.println("Series updated with new data point.");
    }
}