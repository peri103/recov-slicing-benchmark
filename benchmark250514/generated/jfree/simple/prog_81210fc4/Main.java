import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot object
        PiePlot piePlot = new PiePlot();

        // Set the outline paint to a specific color
        Paint outlinePaint = Color.RED;
        /* write */ piePlot.setOutlinePaint(outlinePaint);

        // Retrieve the outline paint to verify it was set correctly
        /* read */ Paint retrievedPaint = piePlot.getOutlinePaint();

        // Print the retrieved paint to confirm its value
        System.out.println(retrievedPaint);
    }
}