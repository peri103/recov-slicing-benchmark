import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        
        // Set the fill paint for the series
        Paint fillPaint = Color.RED;
        /* write */ renderer.setSeriesFillPaint(0, fillPaint);
        
        // Retrieve the fill paint for the series
        /* read */ Paint retrievedPaint = renderer.getSeriesFillPaint(0);
        
        System.out.println(retrievedPaint);
    }
}