import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        Paint positivePaint = new Color(0, 255, 0); // Green color
        /* write */ renderer.setPositivePaint(positivePaint);
        /* read */ Paint readPositivePaint = renderer.getPositivePaint();
        
        System.out.println("Positive Paint: " + readPositivePaint);
    }
}