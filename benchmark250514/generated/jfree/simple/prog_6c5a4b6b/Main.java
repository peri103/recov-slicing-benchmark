import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object (assuming a simple chart for demonstration)
        JFreeChart chart = new JFreeChart(null);

        // Create a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the setChart method to write the chart to the panel
        /* write */ chartPanel.setChart(chart);

        // Use the getChart method to read the chart from the panel
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();

        // Output to verify that the retrieved chart is the same as the one set
        System.out.println(retrievedChart == chart); // This should print "true"
    }
}