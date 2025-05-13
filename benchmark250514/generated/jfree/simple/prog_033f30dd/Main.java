import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Initialize a JFreeChart object (assuming a simple chart is created here for demonstration)
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);

        // Initialize the ChartPanel with the chart
        ChartPanel chartPanel = new ChartPanel(chart);

        // Set a new chart to the ChartPanel
        JFreeChart newChart = new JFreeChart("New Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);
        /* write */ chartPanel.setChart(newChart);

        // Retrieve the chart from the ChartPanel
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();

        // Print the title of the retrieved chart to verify
        System.out.println(retrievedChart.getTitle().getText());
    }
}