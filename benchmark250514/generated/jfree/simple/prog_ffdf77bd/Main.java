import org.jfree.chart.plot.MeterPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        MeterPlot plot = new MeterPlot();
        Paint paint = Color.BLUE;
        /* write */ plot.setDialBackgroundPaint(paint);
        /* read */ Paint readPaint = plot.getDialBackgroundPaint();
        System.out.println(readPaint);
    }
}