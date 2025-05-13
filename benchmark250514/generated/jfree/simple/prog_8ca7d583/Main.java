import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object (assuming a simple chart for demonstration)
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);
        
        // Create a ChartPanel object
        ChartPanel chartPanel = new ChartPanel(chart);
        
        // Use the write method to set the chart
        /* write */ chartPanel.setChart(chart);
        
        // Use the read method to get the chart
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();
        
        // Print the result to verify the read operation
        System.out.println("Chart retrieved: " + (retrievedChart == chart));
    }
}