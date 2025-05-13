import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Initialize the PiePlot object
        PiePlot piePlot = new PiePlot();
        
        // Write operation: set the label background paint to a specific color
        /* write */ piePlot.setLabelBackgroundPaint(Color.BLUE);
        
        // Read operation: retrieve the label background paint
        /* read */ Paint labelBackgroundPaint = piePlot.getLabelBackgroundPaint();
        
        // Print the retrieved paint object
        System.out.println(labelBackgroundPaint);
    }
}