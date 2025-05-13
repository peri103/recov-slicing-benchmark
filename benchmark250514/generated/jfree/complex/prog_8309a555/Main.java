import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize a dataset for the chart
        XYSeries series = new XYSeries("Random Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 100);
        }
        XYDataset dataset = new XYSeriesCollection(series);

        // Create a plot with the dataset
        XYPlot plot = new XYPlot(dataset, null, null, (XYItemRenderer) null);
        JFreeChart chart = new JFreeChart(plot);

        // Create a ChartPanel with the chart
        ChartPanel chartPanel = new ChartPanel(chart);

        // Enable mouse wheel on the chart panel
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Perform unrelated operations
        XYSeries additionalSeries = new XYSeries("Additional Data");
        for (int i = 0; i < 10; i++) {
            additionalSeries.add(i, Math.random() * 50);
        }
        ((XYSeriesCollection) dataset).addSeries(additionalSeries);

        // Modify plot settings
        plot.setDomainGridlinesVisible(true);
        plot.setRangeGridlinesVisible(true);

        // Check if the mouse wheel is enabled
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();
        System.out.println("Mouse Wheel Enabled: " + isEnabled);

        // Print out data from the additional series
        for (int i = 0; i < additionalSeries.getItemCount(); i++) {
            System.out.println("X: " + additionalSeries.getX(i) + ", Y: " + additionalSeries.getY(i));
        }
    }
}