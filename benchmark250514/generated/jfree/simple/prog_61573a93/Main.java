import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ChartPanel
        ChartPanel chartPanel = new ChartPanel(null);
        
        // Use the write method
        /* write */ chartPanel.setMouseWheelEnabled(true);
        
        // Use the read method
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();
        
        // Output the result
        System.out.println("Mouse wheel enabled: " + isEnabled);
    }
}