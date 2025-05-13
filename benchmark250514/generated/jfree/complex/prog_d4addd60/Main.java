import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.AxisLocation;

public class Main {
    public static void main(String[] args) {
        // Initialize the CategoryPlot object
        CategoryPlot plot = new CategoryPlot();

        // Create a ValueAxis object to set as the range axis
        ValueAxis rangeAxis = new NumberAxis("Range Axis");

        // Create another axis for demonstration purposes
        CategoryAxis categoryAxis = new CategoryAxis("Category Axis");

        // Write operation: set the range axis
        /* write */ plot.setRangeAxis(rangeAxis);

        // Set the category axis
        plot.setDomainAxis(categoryAxis);

        // Set the location of the category axis
        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_LEFT);

        // Perform some unrelated operations
        double[] dataValues = {1.0, 2.5, 3.8, 4.4, 5.9};
        for (double value : dataValues) {
            System.out.println("Data value: " + value);
        }

        // Perform calculations
        double sum = 0;
        for (double value : dataValues) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        // Read operation: get the range axis
        /* read */ ValueAxis retrievedAxis = plot.getRangeAxis();

        // Print the result to verify that the read value matches the written value
        System.out.println(retrievedAxis.getLabel());

        // More operations
        double average = sum / dataValues.length;
        System.out.println("Average of values: " + average);

        // Adjust axis properties
        retrievedAxis.setRange(0.0, 10.0);
        System.out.println("Axis range adjusted to: " + retrievedAxis.getRange());
    }
}