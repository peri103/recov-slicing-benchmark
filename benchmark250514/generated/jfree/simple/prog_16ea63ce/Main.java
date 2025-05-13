import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ChartPanel
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the write method to set mouse wheel enabled to true
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Use the read method to check if mouse wheel is enabled
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();

        // Print the result
        System.out.println("Mouse wheel enabled: " + isEnabled);
    }
}