import org.jfree.chart.plot.PiePlot;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        PiePlot plot = new PiePlot();
        Color shadowPaint = Color.GRAY;
        
        /* write */ plot.setLabelShadowPaint(shadowPaint);
        /* read */ Color readShadowPaint = (Color) plot.getLabelShadowPaint();
        
        System.out.println(readShadowPaint);
    }
}