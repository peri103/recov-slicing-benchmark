import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;

public class Main {
    public static void main(String[] args) {
        // Initialize chart data and renderer
        ChartData chartData = new ChartData();
        ChartRenderer chartRenderer = new ChartRenderer();

        // Add data to dataset
        chartData.addValue(1.0, "Series1", "Category1");
        chartData.addValue(4.0, "Series1", "Category2");
        chartData.addValue(3.0, "Series1", "Category3");

        // Create a chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Sample Chart", "Category", "Value", chartData.getDataset());

        // Get the plot
        CategoryPlot plot = (CategoryPlot) chart.getPlot();

        // Set the bar renderer to the plot
        BarRenderer barRenderer = new BarRenderer();
        plot.setRenderer(barRenderer);

        // Set series shapes visibility
        chartRenderer.setSeriesShapesVisible(0, true);

        // Perform some unrelated operations
        CategoryAxis domainAxis = plot.getDomainAxis();
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        domainAxis.setCategoryMargin(0.1);
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // Apply the line renderer to the plot
        plot.setRenderer(1, chartRenderer.getLineRenderer());

        // Add another series
        chartData.addValue(5.0, "Series2", "Category1");
        chartData.addValue(7.0, "Series2", "Category2");
        chartData.addValue(6.0, "Series2", "Category3");

        // Check if the series shapes are visible
        /* read */ Boolean isVisible = chartRenderer.getLineRenderer().getSeriesShapesVisible(0);
        System.out.println("Series 0 shapes visible: " + isVisible);

        // Perform more unrelated operations
        for (int i = 0; i < 3; i++) {
            System.out.println("Value for Series1, Category" + (i + 1) + ": " + chartData.getDataset().getValue("Series1", "Category" + (i + 1)));
        }

        // Modify some dataset values
        chartData.getDataset().setValue(2.0, "Series1", "Category1");
        chartData.getDataset().setValue(8.0, "Series2", "Category2");

        // Print modified values
        System.out.println("Modified Value for Series1, Category1: " + chartData.getDataset().getValue("Series1", "Category1"));
        System.out.println("Modified Value for Series2, Category2: " + chartData.getDataset().getValue("Series2", "Category2"));
    }
}