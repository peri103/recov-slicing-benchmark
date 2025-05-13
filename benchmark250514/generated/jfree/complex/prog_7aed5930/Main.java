import org.jfree.chart.LegendItem;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize the LegendItem object
        LegendItem legendItem = new LegendItem("Sample");

        // Create a shape to set
        Shape shape = new Rectangle2D.Double(0, 0, 10, 10);

        // Write operation: set the shape
        /* write */ legendItem.setShape(shape);

        // Create a dataset for a chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(5.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");

        // Create a chart using the dataset
        JFreeChart chart = ChartFactory.createBarChart(
                "Sample Chart", 
                "Category", 
                "Value", 
                dataset, 
                PlotOrientation.VERTICAL, 
                true, 
                true, 
                false
        );

        // Access the legend title of the chart
        LegendTitle legend = chart.getLegend();
        legend.setBackgroundPaint(Color.LIGHT_GRAY);
        legend.setPosition(org.jfree.chart.ui.RectangleEdge.BOTTOM);

        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Read operation: get the shape
        /* read */ Shape retrievedShape = legendItem.getShape();

        // Output the shape to verify
        System.out.println(retrievedShape);

        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product: " + product);
    }
}