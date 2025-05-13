import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot plot = new PiePlot();

        // Define the section key and color
        Comparable sectionKey = "Section1";
        Color color = Color.RED;

        // Write operation: Set the section paint
        /* write */ plot.setSectionPaint(sectionKey, color);

        // Read operation: Get the section paint
        /* read */ Color retrievedColor = (Color) plot.getSectionPaint(sectionKey);

        // Print the retrieved color to verify
        System.out.println(retrievedColor);
    }
}