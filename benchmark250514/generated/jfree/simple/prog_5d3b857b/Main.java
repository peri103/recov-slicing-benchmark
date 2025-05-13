import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create an instance of PiePlot
        PiePlot piePlot = new PiePlot();

        // Set the shadow paint using the write method
        /* write */ piePlot.setShadowPaint(Color.GRAY);

        // Retrieve the shadow paint using the read method
        /* read */ Paint shadowPaint = piePlot.getShadowPaint();

        // Print the shadow paint to verify the value
        System.out.println(shadowPaint);
    }
}