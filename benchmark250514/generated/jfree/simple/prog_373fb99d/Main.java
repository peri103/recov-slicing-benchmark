import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        
        // Set the label shadow paint using the write method
        Paint shadowPaint = Color.GRAY;
        /* write */ plot.setLabelShadowPaint(shadowPaint);
        
        // Retrieve the label shadow paint using the read method
        /* read */ Paint retrievedPaint = plot.getLabelShadowPaint();
        
        // Print the retrieved paint to verify it's the same as the one set
        System.out.println(retrievedPaint);
    }
}