import org.jfree.chart.renderer.xy.XYDifferenceRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYDifferenceRenderer renderer = new XYDifferenceRenderer();
        /* write */ renderer.setPositivePaint(Color.RED);
        /* read */ Paint positivePaint = renderer.getPositivePaint();
        System.out.println(positivePaint);
    }
}