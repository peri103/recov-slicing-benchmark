import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        ChartPanel chartPanel = new ChartPanel(null); // Assuming a null chart for initialization
        /* write */ chartPanel.setMouseWheelEnabled(true);
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();
        System.out.println(isEnabled);
    }
}