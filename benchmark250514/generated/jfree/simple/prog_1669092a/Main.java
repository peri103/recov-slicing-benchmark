import org.jfree.chart.plot.MeterPlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        MeterPlot meterPlot = new MeterPlot();
        /* write */ meterPlot.setDialBackgroundPaint(Color.BLUE);
        /* read */ Paint dialBackgroundPaint = meterPlot.getDialBackgroundPaint();
        System.out.println(dialBackgroundPaint);
    }
}