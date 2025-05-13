import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Create a dummy chart object for demonstration purposes
        JFreeChart dummyChart = new JFreeChart("Demo Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);

        // Initialize the ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        /* write */ chartPanel.setChart(dummyChart);

        /* read */ JFreeChart retrievedChart = chartPanel.getChart();

        // Print the title of the retrieved chart to verify the operation
        System.out.println(retrievedChart.getTitle().getText());
    }
}