import org.jfree.chart.plot.PolarPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PolarPlot plot = new PolarPlot();
        Paint paint = new Color(255, 0, 0); // Red color
        /* write */ plot.setAngleGridlinePaint(paint);
        /* read */ Paint readPaint = plot.getAngleGridlinePaint();
        System.out.println(readPaint);
    }
}