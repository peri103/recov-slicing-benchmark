import org.jfree.chart.ChartPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {
        // Initialize the ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Set some properties on chartPanel
        chartPanel.setPreferredSize(new Dimension(800, 600));
        chartPanel.setBackground(Color.WHITE);

        // Use the write method to set mouse wheel enabled
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Perform unrelated operations with another JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.BLUE);

        // Additional configuration for chartPanel
        chartPanel.setMouseZoomable(true);
        chartPanel.setOpaque(true);

        // Use the read method to check if mouse wheel is enabled
        /* read */ boolean isMouseWheelEnabled = chartPanel.isMouseWheelEnabled();

        // Print the result
        System.out.println("Mouse Wheel Enabled: " + isMouseWheelEnabled);

        // More operations on panel
        panel.setVisible(true);
        System.out.println("Panel visibility: " + panel.isVisible());

        // Print final configurations
        System.out.println("ChartPanel size: " + chartPanel.getPreferredSize());
        System.out.println("Panel size: " + panel.getPreferredSize());
    }
}