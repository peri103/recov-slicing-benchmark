import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the XYPlot object
        XYPlot plot = new XYPlot();

        // Create a NumberAxis object to set as the domain axis
        NumberAxis domainAxis = new NumberAxis("X-Axis");

        // Use the write method to set the domain axis
        /* write */ plot.setDomainAxis(domainAxis);

        // Create a list of axes for demonstration purposes
        List<ValueAxis> axisList = new ArrayList<>();

        // Add different types of axes to the list
        axisList.add(new NumberAxis("Number Axis"));
        axisList.add(new CategoryAxis("Category Axis"));
        axisList.add(new DateAxis("Date Axis"));

        // Iterate over the list and print the axis labels
        for (ValueAxis axis : axisList) {
            System.out.println("Axis Label: " + axis.getLabel());
        }

        // Perform some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Get the domain axis from the plot
        /* read */ NumberAxis retrievedAxis = (NumberAxis) plot.getDomainAxis();

        // Print the label of the retrieved axis to verify correctness
        System.out.println("Retrieved Axis Label: " + retrievedAxis.getLabel());
    }
}