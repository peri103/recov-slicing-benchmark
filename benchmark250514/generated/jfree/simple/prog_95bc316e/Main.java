import org.jfree.chart.ChartPanel;

public class Main {
    public static void main(String[] args) {
        // Assume we have a chart object to initialize ChartPanel
        org.jfree.chart.JFreeChart chart = new org.jfree.chart.JFreeChart(null);
        ChartPanel panel = new ChartPanel(chart);

        /* write */ panel.setMouseWheelEnabled(true);
        /* read */ boolean isEnabled = panel.isMouseWheelEnabled();

        System.out.println(isEnabled);
    }
}