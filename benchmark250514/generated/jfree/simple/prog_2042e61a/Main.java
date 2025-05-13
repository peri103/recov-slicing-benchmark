import org.jfree.chart.plot.PiePlot;
import java.awt.BasicStroke;
import java.awt.Stroke;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot plot = new PiePlot();

        // Create a Stroke object to be used for setting section outline stroke
        Stroke stroke = new BasicStroke(2.0f);

        // Use the write method to set the section outline stroke
        /* write */ plot.setSectionOutlineStroke("Section1", stroke);

        // Use the read method to retrieve the section outline stroke
        /* read */ Stroke retrievedStroke = plot.getSectionOutlineStroke("Section1");

        // Print the retrieved stroke to verify it's the same as the one set
        System.out.println(retrievedStroke.equals(stroke) ? "Success: Stroke retrieved correctly." : "Error: Stroke retrieval failed.");
    }
}