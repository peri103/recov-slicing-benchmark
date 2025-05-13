import org.jfree.chart.LegendItem;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample Legend");

        // Create a series key to write
        Comparable seriesKey = "Series 1";

        // Write the series key using setSeriesKey method
        /* write */ legendItem.setSeriesKey(seriesKey);

        // Create a dataset for the chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(5.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createBarChart(
                "Sample Chart", "Category", "Value", dataset);

        // Customize the chart
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setRangeGridlinePaint(Color.BLACK);

        // Add legend to the chart
        LegendTitle legend = chart.getLegend();
        legend.setPosition(RectangleEdge.BOTTOM);

        // Add another LegendItem for demonstration
        LegendItem additionalLegendItem = new LegendItem("Additional Legend");
        additionalLegendItem.setSeriesKey("Series 2");
        Comparable additionalKey = additionalLegendItem.getSeriesKey();
        System.out.println("Additional Legend Series Key: " + additionalKey);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read the series key using getSeriesKey method
        /* read */ Comparable retrievedSeriesKey = legendItem.getSeriesKey();

        // Output the retrieved series key to verify the read operation
        System.out.println("Retrieved Series Key: " + retrievedSeriesKey);

        // Perform additional operations on the chart
        plot.setBackgroundPaint(Color.LIGHT_GRAY);
        plot.setDomainGridlinePaint(Color.BLUE);

        // Print some debug information
        System.out.println("Chart title: " + chart.getTitle().getText());
    }
}