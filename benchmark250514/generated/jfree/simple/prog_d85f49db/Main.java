import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Paint paint = Color.RED;
        
        /* write */ plot.setOutlinePaint(paint);
        /* read */ Paint readPaint = plot.getOutlinePaint();
        
        System.out.println(readPaint);
    }
}