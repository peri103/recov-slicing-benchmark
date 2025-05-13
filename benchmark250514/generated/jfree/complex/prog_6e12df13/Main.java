import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initializing a ChartPanel with a dummy chart
        JFreeChart dummyChart = new JFreeChart("Dummy Chart", JFreeChart.DEFAULT_TITLE_FONT, new CategoryPlot(), false);
        ChartPanel chartPanel = new ChartPanel(dummyChart);

        // Additional logic to make the program more complex
        List<String> chartTitles = new ArrayList<>();
        chartTitles.add("Sales Chart");
        chartTitles.add("Revenue Chart");
        chartTitles.add("Growth Chart");

        for (String title : chartTitles) {
            System.out.println("Processing: " + title);
            JFreeChart chart = new JFreeChart(title, JFreeChart.DEFAULT_TITLE_FONT, new CategoryPlot(), false);
            ChartPanel panel = new ChartPanel(chart);
            panel.setMouseWheelEnabled(false); // Setting mouse wheel disabled for other panels
            System.out.println("Mouse Wheel Enabled for " + title + ": " + panel.isMouseWheelEnabled());
        }

        // Original write-read pair
        /* write */ chartPanel.setMouseWheelEnabled(true);

        // Unrelated operations
        BarRenderer renderer = new BarRenderer();
        CategoryPlot plot = (CategoryPlot) dummyChart.getPlot();
        plot.setRenderer(renderer);

        // More complex operations
        int totalCharts = chartTitles.size();
        System.out.println("Total charts processed: " + totalCharts);

        // Final read operation
        /* read */ boolean isEnabled = chartPanel.isMouseWheelEnabled();
        System.out.println("Mouse Wheel Enabled for Dummy Chart: " + isEnabled);
    }
}