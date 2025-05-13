import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.ChartFactory;
import org.jfree.data.general.DefaultPieDataset;

public class Main {
    public static void main(String[] args) {
        // Create a dummy JFreeChart instance with a PiePlot
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Category 1", 43.2);
        dataset.setValue("Category 2", 27.9);
        dataset.setValue("Category 3", 79.5);
        JFreeChart chart = ChartFactory.createPieChart("Sample Pie Chart", dataset, true, true, false);

        // Initialize ChartPanel
        ChartPanel panel = new ChartPanel(chart);

        // Additional operations with the chart
        Plot plot = chart.getPlot();
        if (plot instanceof PiePlot) {
            PiePlot piePlot = (PiePlot) plot;
            piePlot.setSectionOutlinesVisible(false);
            piePlot.setLabelGenerator(null);
        }

        // Use the write method
        /* write */ panel.setMouseWheelEnabled(true);

        // Perform other operations
        panel.setPopupMenu(null);
        panel.setDomainZoomable(true);
        panel.setRangeZoomable(false);

        // Use a similar write-read pair
        panel.setMouseZoomable(true);
        boolean isZoomable = panel.isMouseZoomable();

        // Use the read method
        /* read */ boolean isEnabled = panel.isMouseWheelEnabled();

        // Output the results
        System.out.println("Mouse Wheel Enabled: " + isEnabled);
        System.out.println("Mouse Zoomable: " + isZoomable);

        // Additional unrelated logic to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);
    }
}