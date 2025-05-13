import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot object
        PiePlot piePlot = new PiePlot();
        
        // Create a Paint object to set as label paint
        Paint labelPaint = Color.RED;
        
        // Write operation: Set the label paint
        /* write */ piePlot.setLabelPaint(labelPaint);
        
        // Read operation: Get the label paint
        /* read */ Paint retrievedLabelPaint = piePlot.getLabelPaint();
        
        // Print the retrieved label paint to verify the operation
        System.out.println(retrievedLabelPaint);
    }
}