import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Paint;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Plot plot = new Plot() {
            // Implement abstract methods with dummy implementations
            public String getPlotType() { return ""; }
            protected void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, 
                                org.jfree.chart.plot.PlotState state, 
                                org.jfree.chart.plot.PlotRenderingInfo info) {}
        };

        // Create an ArrayList to store Paint objects
        ArrayList<Paint> paintList = new ArrayList<>();

        // Add some Paint objects to the list
        paintList.add(Color.RED);
        paintList.add(new GradientPaint(0, 0, Color.WHITE, 100, 100, Color.BLACK));
        
        // Set a background paint using the list
        plot.setBackgroundPaint(paintList.get(0));

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More unrelated complex operations
        for (int i = 0; i < paintList.size(); i++) {
            System.out.println("Paint at index " + i + ": " + paintList.get(i));
        }
        
        // Change the background paint to another color
        /* write */ plot.setBackgroundPaint(Color.BLUE);

        // Perform some more operations
        double product = 1.0;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);

        // Finally, read the background paint
        /* read */ Paint backgroundPaint = plot.getBackgroundPaint();
        
        System.out.println("Background paint: " + backgroundPaint);
    }
}