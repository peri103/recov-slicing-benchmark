import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot plot = new PiePlot();

        // Create a Color object to use as the label shadow paint
        Color shadowPaint = new Color(128, 128, 128); // Gray color

        // Set the label shadow paint
        /* write */ plot.setLabelShadowPaint(shadowPaint);

        // Retrieve the label shadow paint
        /* read */ Paint retrievedPaint = plot.getLabelShadowPaint();

        // Output the result to verify
        System.out.println(retrievedPaint.toString());
    }
}