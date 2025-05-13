import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Paint shadowPaint = new Color(100, 100, 100); // Example color for shadow

        /* write */ piePlot.setShadowPaint(shadowPaint);
        /* read */ Paint retrievedShadowPaint = piePlot.getShadowPaint();

        System.out.println(retrievedShadowPaint);
    }
}