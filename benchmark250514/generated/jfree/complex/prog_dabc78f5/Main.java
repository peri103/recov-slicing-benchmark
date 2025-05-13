import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.DefaultXYDataset;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object for demonstration purposes
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);

        // Create a ChartPanel instance
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the setChart method to write the chart into the ChartPanel
        /* write */ chartPanel.setChart(chart);

        // Create a dataset for a new chart
        DefaultXYDataset dataset = new DefaultXYDataset();
        double[][] data = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        dataset.addSeries("Series1", data);

        // Create a plot using the dataset
        XYPlot plot = new XYPlot(dataset, null, null, null);
        plot.setOutlinePaint(Color.BLUE);

        // Create another chart using the plot
        JFreeChart chart2 = new JFreeChart("Another Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        // Create another ChartPanel for the second chart
        ChartPanel chartPanel2 = new ChartPanel(chart2);

        // Modify the renderer of the second chart
        XYItemRenderer renderer = plot.getRenderer();
        renderer.setSeriesPaint(0, Color.RED);

        // Retrieve the chart from the first ChartPanel
        /* read */ JFreeChart readChart = chartPanel.getChart();

        // Print out the chart title to verify the read operation
        System.out.println(readChart.getTitle().getText());

        // Print out the title of the second chart
        System.out.println(chartPanel2.getChart().getTitle().getText());

        // Print out the color of the series in the second chart
        System.out.println(renderer.getSeriesPaint(0));
    }
}