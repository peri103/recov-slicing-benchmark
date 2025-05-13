import org.jfree.chart.plot.PiePlot;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Initialize a PiePlot object
        PiePlot piePlot = new PiePlot();

        // Create a Font object to set as the label font
        Font labelFont = new Font("Arial", Font.PLAIN, 12);

        // Use the write method to set the label font
        /* write */ piePlot.setLabelFont(labelFont);

        // Use the read method to get the label font
        /* read */ Font retrievedFont = piePlot.getLabelFont();

        // Print the font to verify
        System.out.println(retrievedFont);
    }
}