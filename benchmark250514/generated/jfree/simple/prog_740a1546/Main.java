import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Color shadowColor = new Color(50, 50, 50); // Example shadow color

        /* write */ plot.setLabelShadowPaint(shadowColor);
        /* read */ Color retrievedShadowColor = (Color) plot.getLabelShadowPaint();

        System.out.println("Shadow Color: " + retrievedShadowColor);
    }
}