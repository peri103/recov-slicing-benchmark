import org.jfree.chart.plot.Plot;
import java.awt.Color;
import java.awt.Paint;

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

        // Write: Set the background paint of the plot
        /* write */ plot.setBackgroundPaint(backgroundPaint);

        // Read: Get the background paint of the plot
        /* read */ Paint readPaint = plot.getBackgroundPaint();

        // Print the result to verify the read value
        System.out.println(readPaint);
    }
}