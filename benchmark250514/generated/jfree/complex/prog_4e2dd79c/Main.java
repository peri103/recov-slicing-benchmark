import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.PlotOrientation;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();
        
        // Create a ValueAxis object to set as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        // Use the write method to set the range axis
        /* write */ plot.setRangeAxis(rangeAxis);
        
        // Create a CategoryAxis object to set as the domain axis
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        plot.setDomainAxis(domainAxis);
        
        // Set plot orientation
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        
        // Create another NumberAxis for additional configuration
        ValueAxis secondaryAxis = new NumberAxis("Secondary Axis");
        plot.setRangeAxis(1, secondaryAxis);
        
        // Retrieve and print the domain axis to verify its label
        ValueAxis retrievedSecondaryAxis = plot.getRangeAxis(1);
        System.out.println("Secondary Axis Label: " + retrievedSecondaryAxis.getLabel());
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
        
        // Use the read method to get the range axis
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();
        
        // Print the label of the retrieved axis to verify the operation
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());
        
        // Further unrelated operations
        double result = Math.pow(2, 3);
        System.out.println("2 to the power of 3 is: " + result);
    }
}