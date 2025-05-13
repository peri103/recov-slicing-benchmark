import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        Paint positivePaint = new Color(255, 0, 0); // Red color
        /* write */ renderer.setPositivePaint(positivePaint);
        /* read */ Paint readPaint = renderer.getPositivePaint();
        
        System.out.println(readPaint);
    }
}