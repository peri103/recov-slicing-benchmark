import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.SortOrder;
import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Create a MultiplePiePlot instance
        MultiplePiePlot plot = new MultiplePiePlot();
        
        // Create another plot for additional complexity
        PiePlot additionalPlot = new PiePlot();

        // Set some properties on the additional plot
        additionalPlot.setSectionPaint(1, Color.RED);
        additionalPlot.setSectionPaint(2, Color.BLUE);

        // Initialize a variable for demonstration
        int sum = 0;

        // Perform some unrelated calculations
        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        // Set the data extract order on the plot
        /* write */ plot.setDataExtractOrder(SortOrder.ASCENDING);

        // Add more complexity by modifying the additional plot
        additionalPlot.setSectionOutlinesVisible(false);
        additionalPlot.setLabelGenerator(null);

        // Perform another set of unrelated calculations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }

        // Retrieve the data extract order
        /* read */ SortOrder order = plot.getDataExtractOrder();

        // Print out the results
        System.out.println("Data Extract Order: " + order);
        System.out.println("Sum of numbers 0 to 9: " + sum);
        System.out.println("Product of numbers 1 to 5: " + product);
    }
}