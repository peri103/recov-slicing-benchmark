import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot instance
        PiePlot plot = new PiePlot();

        // Create a Color object to use as the outline paint
        Paint outlinePaint = Color.RED;

        // Set the label outline paint using the write method
        /* write */ plot.setLabelOutlinePaint(outlinePaint);

        // Retrieve the label outline paint using the read method
        /* read */ Paint retrievedPaint = plot.getLabelOutlinePaint();

        // Print the retrieved paint to ensure it matches the written value
        System.out.println(retrievedPaint);
    }
}