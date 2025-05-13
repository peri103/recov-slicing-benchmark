import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Create a dummy JFreeChart instance (required for ChartPanel)
        JFreeChart chart = null; // This would normally be a valid JFreeChart object

        // Initialize ChartPanel
        ChartPanel panel = new ChartPanel(chart);

        // Use the write method
        /* write */ panel.setMouseWheelEnabled(true);

        // Use the read method
        /* read */ boolean isEnabled = panel.isMouseWheelEnabled();

        // Output the result
        System.out.println(isEnabled);
    }
}