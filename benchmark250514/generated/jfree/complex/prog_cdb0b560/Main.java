import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot xyPlot = new XYPlot();
        
        // Create a ValueAxis object to set as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");
        
        /* write */ xyPlot.setRangeAxis(rangeAxis);
        
        // Initialize a CategoryPlot object for additional complexity
        CategoryPlot categoryPlot = new CategoryPlot();
        
        // Create a CategoryAxis object and set it as the domain axis of the CategoryPlot
        CategoryAxis domainAxis = new CategoryAxis("Domain Axis");
        categoryPlot.setDomainAxis(domainAxis);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Retrieve the domain axis from the CategoryPlot
        CategoryAxis retrievedDomainAxis = categoryPlot.getDomainAxis();
        System.out.println("Domain Axis Label: " + retrievedDomainAxis.getLabel());

        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        // Retrieve the range axis from the XYPlot
        /* read */ ValueAxis retrievedAxis = xyPlot.getRangeAxis();
        
        // Print the label of the retrieved axis to verify the correct axis is read
        System.out.println("Range Axis Label: " + retrievedAxis.getLabel());
        
        // Additional unrelated operations
        double average = (sum + product) / 2.0;
        System.out.println("Average of sum and product: " + average);
    }
}