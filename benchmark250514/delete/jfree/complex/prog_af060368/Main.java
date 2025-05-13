import org.jfree.chart.LegendItem;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        LegendItem legendItem = new LegendItem("Sample Legend");
        Comparable seriesKey = "Series 1";
        
        /* write */ legendItem.setSeriesKey(seriesKey);
        
        // Create a plot and chart for demonstration purposes
        CategoryAxis categoryAxis = new CategoryAxis("Category");
        ValueAxis valueAxis = new ValueAxis("Value") {};
        BarRenderer renderer = new BarRenderer();
        Plot plot = new CategoryPlot(null, categoryAxis, valueAxis, renderer);
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);

        // Add a legend title to the chart
        LegendTitle legendTitle = new LegendTitle(chart.getPlot());
        chart.addSubtitle(legendTitle);

        // Create another LegendItem and manipulate it
        LegendItem legendItem2 = new LegendItem("Another Legend");
        legendItem2.setSeriesKey("Series 2");

        // Perform some operations unrelated to legend items
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // More complex operations
        double[] values = {1.2, 3.4, 5.6, 7.8};
        double total = 0;
        for (double value : values) {
            total += value;
        }
        System.out.println("Total of array values: " + total);

        /* read */ Comparable readSeriesKey = legendItem.getSeriesKey();
        
        System.out.println(readSeriesKey);
    }
}