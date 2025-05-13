import org.jfree.chart.LegendItem;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Create a dataset for a chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(4.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");
        
        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createBarChart(
            "Sample Chart", 
            "Category", 
            "Value", 
            dataset
        );

        // Create a LegendItem
        LegendItem legendItem = new LegendItem("Sample Legend");
        
        // Perform some operations on the chart
        Color chartBackground = Color.LIGHT_GRAY;
        chart.setBackgroundPaint(chartBackground);
        
        // Modify the label paint of the LegendItem
        /* write */ legendItem.setLabelPaint(Color.RED);
        
        // Perform additional operations on the LegendItem
        legendItem.setShape(new java.awt.geom.Rectangle2D.Double(0, 0, 10, 10));
        legendItem.setOutlinePaint(Color.BLACK);
        
        // Retrieve the label paint of the LegendItem
        /* read */ Color labelPaint = legendItem.getLabelPaint();
        
        // Use the retrieved label paint in another operation
        System.out.println("Legend label paint: " + labelPaint);

        // Perform additional unrelated operations
        LegendItem anotherLegendItem = new LegendItem("Another Legend");
        anotherLegendItem.setLabelPaint(Color.BLUE);
        Color anotherLabelPaint = anotherLegendItem.getLabelPaint();
        System.out.println("Another legend label paint: " + anotherLabelPaint);

        // Print the chart's background color
        System.out.println("Chart background paint: " + chartBackground);
    }
}