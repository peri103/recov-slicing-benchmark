import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Create a null chart and a sample chart
        ChartPanel chartPanel1 = new ChartPanel(null);
        JFreeChart sampleChart = new JFreeChart(null);
        ChartPanel chartPanel2 = new ChartPanel(sampleChart);

        // Initialize ChartManager and add ChartPanels
        ChartManager chartManager = new ChartManager();
        chartManager.addChart(chartPanel1);
        chartManager.addChart(chartPanel2);

        // Enable mouse wheel on the first ChartPanel
        chartManager.getChartSettings(0).enableMouseWheel();

        // Check mouse wheel status of the first ChartPanel
        /* read */ boolean isEnabled = chartManager.getChartSettings(0).isMouseWheelEnabled();
        System.out.println("First ChartPanel mouse wheel enabled: " + isEnabled);

        // Further check all chart settings
        for (int i = 0; i < 2; i++) {
            System.out.println("ChartPanel " + i + " mouse wheel enabled: " + chartManager.getChartSettings(i).isMouseWheelEnabled());
        }
    }
}