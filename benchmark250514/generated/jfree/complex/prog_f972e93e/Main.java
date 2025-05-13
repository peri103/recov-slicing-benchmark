import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot piePlot = new PiePlot();

        // Create a Color object to use for the outline paint
        Color outlineColor = Color.RED;

        // Use the write method to set the outline paint
        /* write */ piePlot.setOutlinePaint(outlineColor);

        // Initialize a CategoryPlot object and set its range axis
        CategoryPlot categoryPlot = new CategoryPlot();
        NumberAxis rangeAxis = new NumberAxis();
        rangeAxis.setRange(0.0, 100.0);
        categoryPlot.setRangeAxis(rangeAxis);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the outline paint from the PiePlot
        /* read */ Color readColor = (Color) piePlot.getOutlinePaint();

        // Print the color to verify the value
        System.out.println("Outline Paint Color: " + readColor);

        // Set more properties on the CategoryPlot
        categoryPlot.setDomainGridlinesVisible(true);
        categoryPlot.setRangeGridlinesVisible(true);

        // Perform some more unrelated operations
        String[] words = {"apple", "banana", "cherry"};
        for (String word : words) {
            System.out.println("Fruit: " + word);
        }
    }
}