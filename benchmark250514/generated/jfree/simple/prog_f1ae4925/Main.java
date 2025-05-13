import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        
        // Define a paint color
        Paint paint = Color.RED;
        
        /* write */ renderer.setSeriesPaint(0, paint);
        
        /* read */ Paint retrievedPaint = renderer.getSeriesPaint(0);
        
        System.out.println(retrievedPaint);
    }
}