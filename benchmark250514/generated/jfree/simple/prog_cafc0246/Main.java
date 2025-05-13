import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        Paint positivePaint = Color.RED;
        
        /* write */ renderer.setPositivePaint(positivePaint);
        /* read */ Paint retrievedPaint = renderer.getPositivePaint();
        
        System.out.println(retrievedPaint);
    }
}