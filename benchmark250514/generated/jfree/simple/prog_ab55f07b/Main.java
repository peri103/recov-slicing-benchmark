import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot plot = new PiePlot();

        // Create a Paint object (using Color as a simple Paint implementation)
        Paint paint = Color.RED;

        // Write operation: Set the label outline paint
        /* write */ plot.setLabelOutlinePaint(paint);

        // Read operation: Get the label outline paint
        /* read */ Paint retrievedPaint = plot.getLabelOutlinePaint();

        // Output the result to verify the operation
        System.out.println(retrievedPaint);
    }
}