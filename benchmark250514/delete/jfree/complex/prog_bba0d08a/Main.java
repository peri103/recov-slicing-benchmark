import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // Initialize the renderer object
        XYItemRenderer renderer = new StandardXYItemRenderer();

        // Create a dataset for demonstration
        XYSeries series = new XYSeries("Random Data");
        for (int i = 0; i < 10; i++) {
            series.add(i, Math.random() * 100);
        }
        XYSeriesCollection dataset = new XYSeriesCollection(series);

        // Create a chart based on the dataset and renderer
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Random Data Chart",
                "X-Axis",
                "Y-Axis",
                dataset,
                org.jfree.chart.plot.PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        // Get the plot from the chart and set the renderer
        XYPlot plot = chart.getXYPlot();
        plot.setRenderer(renderer);

        // Perform some unrelated operations to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Write operation: set the base shapes visibility to true
        /* write */ renderer.setBaseShapesVisible(true);

        // Create a GUI window to display the chart
        JFrame frame = new JFrame("Chart Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setVisible(true);

        // Perform more unrelated operations
        double average = sum / 10.0;
        System.out.println("Average of numbers from 0 to 9: " + average);

        // Read operation: get the base shapes visibility
        /* read */ boolean isVisible = renderer.getBaseShapesVisible();

        // Print the value to verify the read operation
        System.out.println("Base shapes visible: " + isVisible);
    }
}