import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.CategoryPlot;
import java.awt.Color;
import java.awt.Paint;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize a Plot object
        Plot plot = new Plot() {
            @Override
            public String getPlotType() {
                return "CustomPlot";
            }
        };

        // Initialize a CategoryPlot object for additional complexity
        CategoryPlot categoryPlot = new CategoryPlot();
        categoryPlot.setBackgroundPaint(Color.RED);

        // Create a list to store various Paint objects
        ArrayList<Paint> paintList = new ArrayList<>();
        paintList.add(Color.GREEN);
        paintList.add(Color.YELLOW);
        paintList.add(Color.CYAN);

        // Randomly select a paint from the list
        Random random = new Random();
        Paint selectedPaint = paintList.get(random.nextInt(paintList.size()));

        // Set the background paint of the plot
        /* write */ plot.setBackgroundPaint(selectedPaint);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);

        // Use the CategoryPlot object
        Paint categoryPaint = categoryPlot.getBackgroundPaint();
        System.out.println("CategoryPlot Background Paint: " + categoryPaint);

        // Retrieve the background paint of the plot
        /* read */ Paint paint = plot.getBackgroundPaint();

        // Print the retrieved paint
        System.out.println("Plot Background Paint: " + paint);

        // Further complexity with additional operations
        for (Paint p : paintList) {
            if (p.equals(paint)) {
                System.out.println("Match found in paint list!");
            }
        }
    }
}