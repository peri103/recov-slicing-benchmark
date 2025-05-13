import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the Plot object
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "Custom Plot";
            }
        };

        // Create a Color object to use as background paint
        Paint backgroundPaint = Color.BLUE;

        // Create another Plot object for additional operations
        Plot anotherPlot = new Plot() {
            @Override
            public String getPlotType() {
                return "Another Custom Plot";
            }
        };

        // Set a different background paint for anotherPlot
        anotherPlot.setBackgroundPaint(Color.RED);

        // Create a list to store plots
        ArrayList<Plot> plotList = new ArrayList<>();
        plotList.add(plot);
        plotList.add(anotherPlot);

        // Perform operations on the list
        for (Plot p : plotList) {
            System.out.println("Plot type: " + p.getPlotType());
            System.out.println("Background paint: " + p.getBackgroundPaint());
        }

        // Write: Set the background paint of the original plot
        /* write */ plot.setBackgroundPaint(backgroundPaint);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read: Get the background paint of the original plot
        /* read */ Paint readPaint = plot.getBackgroundPaint();

        // Print the result to verify the read value
        System.out.println("Read background paint: " + readPaint);

        // More unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }
    }
}