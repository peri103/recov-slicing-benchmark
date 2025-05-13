import org.jfree.chart.renderer.xy.StackedXYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        StackedXYAreaRenderer renderer = new StackedXYAreaRenderer();
        
        Paint paint = new Color(255, 0, 0); // Red color
        /* write */ renderer.setSeriesPaint(0, paint);
        
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(0);
        System.out.println(retrievedPaint);
    }
}