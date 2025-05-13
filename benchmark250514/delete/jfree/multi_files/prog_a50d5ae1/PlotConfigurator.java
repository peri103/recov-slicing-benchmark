import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.plot.PlotOrientation;

public class PlotConfigurator {

    public static void configurePlot(CategoryPlot plot) {
        // Create a ValueAxis object for the range axis
        ValueAxis rangeAxis = new ValueAxis("Range Axis") {};

        // Create a renderer for the plot
        CategoryItemRenderer renderer = new BarRenderer();

        // Set the range axis and renderer
        plot.setRangeAxis(rangeAxis);
        plot.setRenderer(renderer);

        // Set the orientation of the plot
        plot.setOrientation(PlotOrientation.HORIZONTAL);

        // Additional complex operations
        plot.setDomainAxis(1, new CategoryAxis("Another Axis"));
        plot.setDomainAxis(2, new CategoryAxis("Third Axis"));
        plot.setOrientation(PlotOrientation.VERTICAL);
        System.out.println("Orientation set to: " + plot.getOrientation());
    }
}