import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        ChartPanel chartPanel = new ChartPanel(null); // Assuming null is acceptable for the constructor in this context
        /* write */ chartPanel.setMouseWheelEnabled(true);
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();
        System.out.println(isEnabled);
    }
}