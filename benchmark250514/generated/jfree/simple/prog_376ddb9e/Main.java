import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        // Initialize a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the write method to set mouse wheel enabled
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Use the read method to check if mouse wheel is enabled
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();

        // Print the result
        System.out.println("Mouse wheel enabled: " + isEnabled);
    }
}