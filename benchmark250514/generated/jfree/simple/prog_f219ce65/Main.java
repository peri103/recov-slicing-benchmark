import org.jfree.chart.renderer.xy.XYAreaRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        XYAreaRenderer renderer = new XYAreaRenderer();
        
        // Setting a fill paint for series index 0
        Paint fillPaint = Color.RED;
        /* write */ renderer.setSeriesFillPaint(0, fillPaint);
        
        // Retrieving the fill paint for series index 0
        /* read */ Paint retrievedFillPaint = renderer.getSeriesFillPaint(0);
        
        System.out.println("Fill paint set and retrieved: " + retrievedFillPaint);
    }
}