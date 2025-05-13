import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot piePlot = new PiePlot();
        Paint paint = Color.RED;
        
        /* write */ piePlot.setLabelShadowPaint(paint);
        
        /* read */ Paint readPaint = piePlot.getLabelShadowPaint();
        
        System.out.println(readPaint);
    }
}