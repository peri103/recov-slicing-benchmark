import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import java.awt.Color;
import java.awt.Paint;

public class Main {
    public static void main(String[] args) {
        // Instantiate the renderer
        XYItemRenderer renderer = new XYLineAndShapeRenderer();
        
        // Define the series index and the paint color
        int seriesIndex = 0;
        Paint paint = Color.RED;

        // Write the paint color for the series
        /* write */ renderer.setSeriesPaint(seriesIndex, paint);

        // Read the paint color for the series
        /* read */ Paint readPaint = renderer.getSeriesPaint(seriesIndex);

        // Print the result to verify
        System.out.println(readPaint);
    }
}