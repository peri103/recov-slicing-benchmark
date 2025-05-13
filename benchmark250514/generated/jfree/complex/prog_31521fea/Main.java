import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Main {
    public static void main(String[] args) {
        // Initializing the CategoryPlot with axes and dataset
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        CategoryPlot plot = new CategoryPlot(dataset, domainAxis, rangeAxis, null);
        
        // Create a renderer and set it to the plot
        CategoryItemRenderer renderer = new LineAndShapeRenderer();
        /* write */ plot.setRenderer(renderer);

        // Add some data to the dataset
        dataset.addValue(1.0, "Row 1", "Column 1");
        dataset.addValue(2.0, "Row 1", "Column 2");
        dataset.addValue(3.0, "Row 1", "Column 3");

        // Create another renderer
        BarRenderer barRenderer = new BarRenderer();
        plot.setRenderer(barRenderer);

        // Perform some calculations with dataset
        double sum = 0;
        for (int i = 0; i < dataset.getColumnCount(); i++) {
            sum += dataset.getValue(0, i).doubleValue();
        }
        System.out.println("Sum of values: " + sum);

        // Retrieve the renderer from the plot
        /* read */ CategoryItemRenderer readRenderer = plot.getRenderer();
        System.out.println("Renderer class: " + readRenderer.getClass().getName());

        // More operations with the dataset
        for (int i = 0; i < dataset.getColumnCount(); i++) {
            double value = dataset.getValue(0, i).doubleValue();
            System.out.println("Value at Column " + (i + 1) + ": " + value);
        }
    }
}