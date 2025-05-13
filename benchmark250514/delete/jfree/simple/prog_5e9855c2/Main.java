import org.jfree.chart.plot.WaferMapPlot;
import java.awt.Paint;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize WaferMapPlot object
        WaferMapPlot plot = new WaferMapPlot();

        // Create a Paint object (using Color for simplicity)
        Paint paint = Color.RED;

        /* write */ plot.setPaint(paint);

        /* read */ Paint retrievedPaint = plot.getPaint();

        // Output the result to verify the retrieved paint is the same as the one set
        System.out.println(retrievedPaint);
    }
}