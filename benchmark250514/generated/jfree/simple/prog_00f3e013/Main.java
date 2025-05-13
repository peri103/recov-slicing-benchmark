import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create an instance of XYAreaRenderer
        XYAreaRenderer renderer = new XYAreaRenderer();

        // Define a paint color
        Paint fillPaint = Color.BLUE;

        // Set the series fill paint for series index 0
        /* write */ renderer.setSeriesFillPaint(0, fillPaint);

        // Retrieve the series fill paint for series index 0
        /* read */ Paint retrievedPaint = renderer.getSeriesFillPaint(0);

        // Print the result to verify
        System.out.println("Retrieved Paint: " + retrievedPaint);
    }
}