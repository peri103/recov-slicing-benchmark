import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Paint shadowPaint = new Color(100, 100, 100); // Example color
        /* write */ plot.setShadowPaint(shadowPaint);
        /* read */ Paint retrievedPaint = plot.getShadowPaint();
        System.out.println(retrievedPaint);
    }
}