import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Main {
    public static void main(String[] args) {
        // Create a Pie Chart
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Category 1", 40);
        pieDataset.setValue("Category 2", 30);
        pieDataset.setValue("Category 3", 30);
        JFreeChart pieChart = new JFreeChart("Pie Chart", JFreeChart.DEFAULT_TITLE_FONT, new PiePlot(pieDataset), false);

        // Create an XY Chart
        XYSeries series = new XYSeries("Series 1");
        series.add(1, 1);
        series.add(2, 4);
        series.add(3, 3);
        XYSeriesCollection xyDataset = new XYSeriesCollection(series);
        JFreeChart xyChart = new JFreeChart("XY Chart", JFreeChart.DEFAULT_TITLE_FONT, new XYPlot(xyDataset, null, null, null), false);

        // Initialize the ChartPanel with the XY chart
        ChartPanel chartPanel = new ChartPanel(xyChart);

        // Perform operations on the pie chart
        System.out.println("Original Pie Chart Title: " + pieChart.getTitle().getText());
        pieChart.setTitle("Updated Pie Chart");

        // Set a new chart (Pie Chart) to the ChartPanel
        /* write */ chartPanel.setChart(pieChart);

        // Perform operations on the XY chart
        System.out.println("Original XY Chart Title: " + xyChart.getTitle().getText());
        xyChart.setTitle("Updated XY Chart");

        // Retrieve the chart from the ChartPanel
        /* read */ JFreeChart retrievedChart = chartPanel.getChart();

        // Print the title of the retrieved chart to verify
        System.out.println("Retrieved Chart Title: " + retrievedChart.getTitle().getText());

        // Additional operations on datasets
        pieDataset.setValue("Category 4", 50);
        series.add(4, 5);
        System.out.println("Updated Pie Dataset: " + pieDataset.getValue("Category 4"));
        System.out.println("Updated XY Series: " + series.getY(3));
    }
}