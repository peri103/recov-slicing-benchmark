import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Create a PiePlot instance
        PiePlot piePlot = new PiePlot();

        // Create a Paint instance for shadow
        Paint shadowPaint = Color.GRAY;

        // Write operation
        /* write */ piePlot.setShadowPaint(shadowPaint);

        // Read operation
        /* read */ Paint retrievedShadowPaint = piePlot.getShadowPaint();

        // Print the result to verify
        System.out.println("Shadow Paint: " + retrievedShadowPaint);
    }
}