import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        // Initialize a ChartPanel with a dummy chart
        Plot plot = new CategoryPlot();
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        ChartPanel chartPanel = new ChartPanel(chart);

        // Set mouse wheel enabled for the ChartPanel
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Additional operations on the chart
        CategoryPlot categoryPlot = (CategoryPlot) chart.getPlot();
        BarRenderer renderer = new BarRenderer();
        categoryPlot.setRenderer(renderer);

        // Perform some unrelated operations
        int[] data = {5, 10, 15, 20};
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        System.out.println("Sum of data: " + sum);

        // Read the mouse wheel enabled state
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();
        System.out.println("Mouse wheel enabled: " + isEnabled);

        // More unrelated operations
        int max = data[0];
        for (int num : data) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max value in data: " + max);

        // Further operations on the chart
        renderer.setSeriesPaint(0, java.awt.Color.RED);
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setRangeGridlinesVisible(true);
    }
}