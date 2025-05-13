import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object (dummy initialization for demonstration)
        JFreeChart chart = new JFreeChart(null);

        // Initialize a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        /* write */ chartPanel.setChart(chart);

        /* read */ JFreeChart retrievedChart = chartPanel.getChart();

        // Print the result to verify
        System.out.println(retrievedChart == chart); // Should print true if the read value matches the written value
    }
}