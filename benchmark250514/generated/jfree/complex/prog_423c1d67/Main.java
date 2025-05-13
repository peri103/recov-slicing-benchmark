import org.jfree.chart.plot.PiePlot;
import java.awt.Font;
import java.awt.Color;
import org.jfree.chart.plot.Plot;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot object
        PiePlot piePlot = new PiePlot();

        // Create a Font object to set as the label font
        Font labelFont = new Font("Arial", Font.PLAIN, 12);

        // Use the write method to set the label font
        /* write */ piePlot.setLabelFont(labelFont);

        // Perform some unrelated operations
        Color backgroundColor = new Color(255, 255, 255);
        piePlot.setBackgroundPaint(backgroundColor);

        // Initialize another PiePlot object and set different properties
        PiePlot anotherPiePlot = new PiePlot();
        anotherPiePlot.setSectionPaint(0, Color.RED);
        anotherPiePlot.setSectionPaint(1, Color.BLUE);

        // Perform operations on the original PiePlot
        piePlot.setOutlinePaint(Color.BLACK);
        piePlot.setShadowPaint(Color.GRAY);

        // Use the read method to get the label font
        /* read */ Font retrievedFont = piePlot.getLabelFont();

        // Print the font to verify
        System.out.println(retrievedFont);

        // Perform additional operations on the PiePlot
        piePlot.setSectionPaint(2, Color.GREEN);
        piePlot.setSectionPaint(3, Color.YELLOW);

        // Print some properties of the PiePlot
        System.out.println("Background color: " + piePlot.getBackgroundPaint());
        System.out.println("Outline color: " + piePlot.getOutlinePaint());
    }
}