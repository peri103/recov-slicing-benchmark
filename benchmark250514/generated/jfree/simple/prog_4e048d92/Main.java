import org.jfree.chart.plot.PolarPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PolarPlot plot = new PolarPlot();
        Paint paint = Color.RED;
        /* write */ plot.setAngleGridlinePaint(paint);
        /* read */ Paint readPaint = plot.getAngleGridlinePaint();
        System.out.println(readPaint);
    }
}