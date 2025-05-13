import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.axis.NumberAxis;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot instance
        PiePlot piePlot = new PiePlot();
        
        // Create a Color object to use as the outline paint
        Paint outlinePaint = Color.RED;

        // Set the label outline paint using the write method
        /* write */ piePlot.setLabelOutlinePaint(outlinePaint);

        // Initialize a CategoryPlot instance
        CategoryPlot categoryPlot = new CategoryPlot();

        // Set up a NumberAxis for the category plot
        NumberAxis numberAxis = new NumberAxis("Values");
        categoryPlot.setRangeAxis(numberAxis);

        // Create another Color object to use as the background paint
        Paint backgroundPaint = Color.BLUE;

        // Set the background paint for the category plot
        categoryPlot.setBackgroundPaint(backgroundPaint);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Retrieve the label outline paint using the read method
        /* read */ Paint retrievedPaint = piePlot.getLabelOutlinePaint();

        // Print the retrieved paint to ensure it matches the written value
        System.out.println("Label Outline Paint: " + retrievedPaint);

        // Perform more unrelated operations with the category plot
        Paint retrievedBackgroundPaint = categoryPlot.getBackgroundPaint();
        System.out.println("Category Plot Background Paint: " + retrievedBackgroundPaint);

        // Calculate and print the average of the first 10 natural numbers
        double average = sum / 10.0;
        System.out.println("Average of first 10 natural numbers: " + average);
    }
}