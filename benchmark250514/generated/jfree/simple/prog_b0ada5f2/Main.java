import org.jfree.chart.plot.PiePlot;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot plot = new PiePlot();

        // Create a Font object to be used for setting the label font
        Font font = new Font("Arial", Font.PLAIN, 12);

        // Write operation: Set the label font of the PiePlot
        /* write */ plot.setLabelFont(font);

        // Read operation: Retrieve the label font of the PiePlot
        /* read */ Font retrievedFont = plot.getLabelFont();

        // Print the retrieved font to verify it matches the font that was set
        System.out.println("Label Font: " + retrievedFont);
    }
}