import org.jfree.chart.renderer.Renderer;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.BasicStroke;
import java.awt.Color;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Initialize renderer and set some properties
        Renderer renderer = new BarRenderer();
        BasicStroke stroke = new BasicStroke(2.0f);
        /* write */ renderer.setBaseStroke(stroke);
        
        // Create a dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(4.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");
        
        // Create axes
        CategoryAxis categoryAxis = new CategoryAxis("Category");
        NumberAxis valueAxis = new NumberAxis("Value");
        
        // Create plot
        CategoryPlot plot = new CategoryPlot(dataset, categoryAxis, valueAxis, (BarRenderer) renderer);
        plot.setBackgroundPaint(Color.lightGray);
        
        // Create chart
        JFreeChart chart = new JFreeChart("Sample Chart", JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        
        // Perform some operations on the chart
        chart.setBackgroundPaint(Color.white);
        chart.setBorderVisible(true);
        
        // Retrieve and print the stroke width from renderer
        /* read */ BasicStroke retrievedStroke = (BasicStroke) renderer.getBaseStroke();
        System.out.println("Stroke width: " + retrievedStroke.getLineWidth());

        // Additional operations to make the program more complex
        BarRenderer barRenderer = (BarRenderer) plot.getRenderer();
        barRenderer.setSeriesPaint(0, Color.blue);
        barRenderer.setSeriesPaint(1, Color.green);
        
        for (int i = 0; i < dataset.getColumnCount(); i++) {
            Number value = dataset.getValue("Row 1", dataset.getColumnKey(i));
            System.out.println("Value at column " + i + ": " + value);
        }
    }
}