import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.title.TextTitle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a dummy chart object for demonstration purposes
        JFreeChart dummyChart = new JFreeChart("Demo Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);

        // Initialize the ChartPanel object
        ChartPanel chartPanel = new ChartPanel(null);

        // Create another dummy chart with a different title
        JFreeChart anotherChart = new JFreeChart("Another Chart", JFreeChart.DEFAULT_TITLE_FONT, null, false);

        // Create a list to store chart titles
        ArrayList<String> chartTitles = new ArrayList<>();

        // Add the title of anotherChart to the list
        chartTitles.add(anotherChart.getTitle().getText());

        // Set the chart to the panel
        /* write */ chartPanel.setChart(dummyChart);

        // Perform some unrelated operations
        for (int i = 0; i < 5; i++) {
            chartTitles.add("Title " + i);
        }

        // Modify the title of the dummyChart
        dummyChart.setTitle(new TextTitle("Updated Demo Chart"));

        // Retrieve the chart from the panel
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();

        // Print the title of the retrieved chart to verify the operation
        System.out.println(retrievedChart.getTitle().getText());

        // Print all chart titles stored in the list
        for (String title : chartTitles) {
            System.out.println(title);
        }

        // Add some more unrelated logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}