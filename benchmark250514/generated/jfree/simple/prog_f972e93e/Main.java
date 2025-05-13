import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot piePlot = new PiePlot();

        // Create a Color object to use for the outline paint
        Color outlineColor = Color.RED;

        // Use the write method to set the outline paint
        /* write */ piePlot.setOutlinePaint(outlineColor);

        // Use the read method to get the outline paint
        /* read */ Color readColor = (Color) piePlot.getOutlinePaint();

        // Print the color to verify the value
        System.out.println(readColor);
    }
}