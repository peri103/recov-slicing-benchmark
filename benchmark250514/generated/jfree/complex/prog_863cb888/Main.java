import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot
        PiePlot plot = new PiePlot();
        Paint paint = new Color(255, 0, 0); // Red color

        // Initialize another plot for demonstration
        PiePlot anotherPlot = new PiePlot();
        Paint anotherPaint = new Color(0, 255, 0); // Green color
        anotherPlot.setLabelPaint(anotherPaint);

        // Initialize a list to store plot objects
        List<Plot> plotList = new ArrayList<>();
        plotList.add(plot);
        plotList.add(anotherPlot);

        // Perform operations on the list
        for (Plot p : plotList) {
            System.out.println("Plot class: " + p.getClass().getName());
        }

        // Modify the label paint of the first plot
        /* write */ plot.setLabelPaint(paint);

        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Retrieve the label paint of the first plot
        /* read */ Paint retrievedPaint = plot.getLabelPaint();
        System.out.println("Retrieved Paint: " + retrievedPaint);

        // Perform more complex operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}