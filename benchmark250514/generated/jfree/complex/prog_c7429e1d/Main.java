import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot object
        PiePlot piePlot = new PiePlot();
        
        // Create a Paint object to set as label paint
        Paint labelPaint = Color.RED;
        
        // Write operation: Set the label paint
        /* write */ piePlot.setLabelPaint(labelPaint);
        
        // Initialize another PiePlot object
        PiePlot anotherPiePlot = new PiePlot();
        
        // Set a different label paint for the second PiePlot
        anotherPiePlot.setLabelPaint(Color.BLUE);
        
        // Initialize an ArrayList to store PiePlot objects
        ArrayList<PiePlot> piePlots = new ArrayList<>();
        piePlots.add(piePlot);
        piePlots.add(anotherPiePlot);
        
        // Process each PiePlot in the list
        for (PiePlot plot : piePlots) {
            Paint paint = plot.getLabelPaint();
            System.out.println("Label paint: " + paint);
        }
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Read operation: Get the label paint
        /* read */ Paint retrievedLabelPaint = piePlot.getLabelPaint();
        
        // Print the retrieved label paint to verify the operation
        System.out.println("Retrieved label paint: " + retrievedLabelPaint);
        
        // Initialize an array and perform operations
        int[] numbers = {1, 2, 3, 4, 5};
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of array elements: " + product);
    }
}