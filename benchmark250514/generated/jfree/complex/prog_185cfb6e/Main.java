import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.LegendItemCollection;

public class Main {
    public static void main(String[] args) {
        // Initialize CategoryPlot and Renderer
        CategoryPlot plot = new CategoryPlot();
        CategoryItemRenderer renderer = new DefaultCategoryItemRenderer();
        
        // Set up axes
        CategoryAxis domainAxis = new CategoryAxis("Category");
        NumberAxis rangeAxis = new NumberAxis("Value");
        plot.setDomainAxis(domainAxis);
        plot.setRangeAxis(rangeAxis);

        // Set up a different renderer for demonstration
        LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
        plot.setRenderer(lineRenderer);

        // Perform some operations on the plot
        LegendItemCollection legendItems = plot.getLegendItems();
        System.out.println("Initial Legend Items: " + legendItems);

        // Write the renderer
        /* write */ plot.setRenderer(renderer);

        // Perform some unrelated operations
        CategoryAxis secondaryDomainAxis = new CategoryAxis("Secondary Category");
        plot.setDomainAxis(1, secondaryDomainAxis);

        // More operations
        NumberAxis secondaryRangeAxis = new NumberAxis("Secondary Value");
        plot.setRangeAxis(1, secondaryRangeAxis);

        // Read the renderer
        /* read */ CategoryItemRenderer readRenderer = plot.getRenderer();
        System.out.println("Read Renderer: " + readRenderer);

        // Further operations on the plot
        LegendItemCollection updatedLegendItems = plot.getLegendItems();
        System.out.println("Updated Legend Items: " + updatedLegendItems);

        // Demonstrate multiple renderers
        plot.setRenderer(1, lineRenderer);
        CategoryItemRenderer secondaryRenderer = plot.getRenderer(1);
        System.out.println("Secondary Renderer: " + secondaryRenderer);
    }
}