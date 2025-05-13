import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create a dummy dataset
        XYSeries series = new XYSeries("Data");
        series.add(1.0, 5.0);
        series.add(2.0, 7.0);
        series.add(3.0, 6.0);
        XYDataset dataset = new XYSeriesCollection(series);

        // Create a dummy plot
        Plot plot = new XYPlot(dataset, null, null, null);

        // Create a dummy chart
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        // Initialize a ChartPanel object with the chart
        ChartPanel chartPanel = new ChartPanel(chart);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use the write method to set mouse wheel enabled
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // More unrelated operations
        double product = 1.0;
        for (double i = 1.0; i <= 5.0; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Use the read method to check if mouse wheel is enabled
        /* read */ boolean isMouseWheelEnabled = chartPanel.isMouseWheelEnabled();

        // Print the result
        System.out.println("Is mouse wheel enabled: " + isMouseWheelEnabled);

        // Additional unrelated operations
        StringBuilder builder = new StringBuilder();
        builder.append("Complexity");
        builder.append(" in code");
        System.out.println(builder.toString());
    }
}