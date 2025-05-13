import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineRenderer3D;
import org.jfree.chart.renderer.category.CategoryItemRenderer;

public class Main {
    public static void main(String[] args) {
        CategoryPlot plot = new CategoryPlot();
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Create a CategoryAxis and set it to the plot
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        plot.setDomainAxis(domainAxis);
        
        // Create a BarRenderer and set it to the plot
        CategoryItemRenderer barRenderer = new BarRenderer();
        plot.setRenderer(barRenderer);
        
        // Create a LineRenderer3D and set it to the plot
        CategoryItemRenderer lineRenderer = new LineRenderer3D();
        plot.setRenderer(lineRenderer);
        
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // Perform some operations on the plot
        System.out.println("Domain Axis Label: " + plot.getDomainAxis().getLabel());
        System.out.println("Renderer Class Name: " + plot.getRenderer().getClass().getName());
        
        // Change the range axis label
        rangeAxis.setLabel("Updated Range Axis");
        
        // Perform calculations or manipulations
        double[] sampleData = {1.0, 2.5, 3.8, 4.0};
        double sum = 0;
        for (double data : sampleData) {
            sum += data;
        }
        double average = sum / sampleData.length;
        System.out.println("Average of sample data: " + average);
        
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        // Print the retrieved axis label
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());
        
        // Additional operations
        double maxValue = Double.MIN_VALUE;
        for (double data : sampleData) {
            if (data > maxValue) {
                maxValue = data;
            }
        }
        System.out.println("Max value in sample data: " + maxValue);
    }
}