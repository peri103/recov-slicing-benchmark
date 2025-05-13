import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        Paint fillPaint = Color.RED;
        
        /* write */ renderer.setSeriesFillPaint(0, fillPaint);
        /* read */ Paint readPaint = renderer.getSeriesFillPaint(0);
        
        System.out.println(readPaint);
    }
}