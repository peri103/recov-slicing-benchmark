import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.BarRenderer;

public class Main {
    public static void main(String[] args) {
        // Create a CategoryPlot instance
        CategoryPlot plot = new CategoryPlot();
        
        // Create a ValueAxis instance to be used as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Create a CategoryAxis instance to be used as the domain axis
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        
        // Create a CategoryItemRenderer instance
        CategoryItemRenderer renderer = new BarRenderer();
        
        // Set the domain axis and renderer to the plot
        plot.setDomainAxis(domainAxis);
        plot.setRenderer(renderer);
        
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // Perform some operations on the domain axis
        domainAxis.setCategoryMargin(0.1);
        System.out.println("Domain Axis Label: " + domainAxis.getLabel());
        
        // Perform some operations on the renderer
        renderer.setBaseSeriesVisible(true);
        System.out.println("Renderer Base Series Visible: " + renderer.getBaseSeriesVisible());
        
        // Introduce unrelated operations to increase complexity
        NumberAxis additionalAxis = new NumberAxis("Additional Axis");
        additionalAxis.setAutoRangeIncludesZero(false);
        System.out.println("Additional Axis Range Includes Zero: " + additionalAxis.getAutoRangeIncludesZero());
        
        // Retrieve the range axis set earlier
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        // Output the label of the retrieved axis to verify
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());
        
        // Perform operations on the retrieved axis
        retrievedAxis.setTickLabelsVisible(true);
        System.out.println("Retrieved Axis Tick Labels Visible: " + retrievedAxis.isTickLabelsVisible());
    }
}