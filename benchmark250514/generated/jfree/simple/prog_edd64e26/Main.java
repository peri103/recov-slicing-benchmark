import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        Paint paint = Color.RED;
        
        /* write */ renderer.setSeriesFillPaint(0, paint);
        /* read */ Paint retrievedPaint = renderer.getSeriesFillPaint(0);
        
        System.out.println(retrievedPaint);
    }
}