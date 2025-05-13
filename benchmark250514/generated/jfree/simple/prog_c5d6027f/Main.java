import org.jfree.chart.plot.PiePlot;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Paint shadowPaint = Color.GRAY;
        
        /* write */ plot.setLabelShadowPaint(shadowPaint);
        /* read */ Paint readShadowPaint = plot.getLabelShadowPaint();
        
        System.out.println(readShadowPaint);
    }
}