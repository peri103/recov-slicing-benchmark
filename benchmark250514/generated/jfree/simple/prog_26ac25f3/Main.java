import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Color color = new Color(255, 255, 255); // White color
        
        /* write */ plot.setLabelBackgroundPaint(color);
        
        /* read */ Color readColor = (Color) plot.getLabelBackgroundPaint();
        
        System.out.println("Label Background Paint Color: " + readColor);
    }
}