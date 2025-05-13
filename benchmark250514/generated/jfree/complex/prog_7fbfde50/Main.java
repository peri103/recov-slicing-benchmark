import org.jfree.chart.LegendItem;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        // Create a LegendItem and set its series index
        LegendItem legendItem = new LegendItem("Sample Legend");
        /* write */ legendItem.setSeriesIndex(5);

        // Create a dataset and a chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row1", "Column1");
        dataset.addValue(2.0, "Row2", "Column2");
        
        JFreeChart chart = ChartFactory.createBarChart(
            "Sample Chart", 
            "Category", 
            "Value", 
            dataset
        );

        // Modify the plot
        Plot plot = chart.getPlot();
        plot.setBackgroundPaint(java.awt.Color.lightGray);

        // Add more LegendItems with different properties
        LegendItem legendItem2 = new LegendItem("Another Legend");
        legendItem2.setSeriesIndex(10);
        LegendItem legendItem3 = new LegendItem("Third Legend");
        legendItem3.setSeriesIndex(15);

        // Perform operations on the chart
        chart.setTitle("Updated Sample Chart");

        // Retrieve the series index from the original LegendItem
        /* read */ int seriesIndex = legendItem.getSeriesIndex();
        System.out.println(seriesIndex);

        // Print properties of other legend items
        System.out.println("LegendItem2 Series Index: " + legendItem2.getSeriesIndex());
        System.out.println("LegendItem3 Series Index: " + legendItem3.getSeriesIndex());
    }
}