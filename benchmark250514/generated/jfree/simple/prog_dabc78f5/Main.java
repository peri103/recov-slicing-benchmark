import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object for demonstration purposes
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);

        // Create a ChartPanel instance
        ChartPanel chartPanel = new ChartPanel(null);

        // Use the setChart method to write the chart into the ChartPanel
        /* write */ chartPanel.setChart(chart);

        // Use the getChart method to read the chart from the ChartPanel
        /* read */ JFreeChart readChart = chartPanel.getChart();

        // Print out the chart title to verify the read operation
        System.out.println(readChart.getTitle().getText());
    }
}