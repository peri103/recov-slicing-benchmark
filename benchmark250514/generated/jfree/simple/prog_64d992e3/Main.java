import org.jfree.chart.plot.MeterPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        MeterPlot meterPlot = new MeterPlot();
        Paint paint = Color.BLUE;
        
        /* write */ meterPlot.setDialBackgroundPaint(paint);
        /* read */ Paint readPaint = meterPlot.getDialBackgroundPaint();
        
        System.out.println(readPaint);
    }
}