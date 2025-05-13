import org.jfree.chart.renderer.xy.XYStepAreaRenderer;
import java.awt.BasicStroke;
import java.awt.Stroke;
import java.awt.Color;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

public class Main {
    public static void main(String[] args) {
        XYStepAreaRenderer renderer = new XYStepAreaRenderer();
        
        // Initialize a stroke object to be used for setting and getting the outline stroke
        Stroke stroke = new BasicStroke(2.0f);
        
        /* write */ renderer.setSeriesOutlineStroke(0, stroke);

        // Create another renderer and set some properties
        XYLineAndShapeRenderer lineRenderer = new XYLineAndShapeRenderer();
        lineRenderer.setSeriesPaint(0, Color.BLUE);
        lineRenderer.setSeriesShapesVisible(0, true);
        
        // Perform some unrelated operations
        int[] dataPoints = new int[5];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = i * 10;
        }
        
        for (int point : dataPoints) {
            System.out.println("Data point: " + point);
        }
        
        // Use the lineRenderer for another series
        lineRenderer.setSeriesPaint(1, Color.RED);
        lineRenderer.setSeriesShapesVisible(1, false);
        
        // Retrieve the stroke set earlier
        /* read */ Stroke retrievedStroke = renderer.getSeriesOutlineStroke(0);
        
        System.out.println("Is the stroke set correctly? " + retrievedStroke.equals(stroke));
        
        // Perform additional operations with the renderer
        renderer.setSeriesOutlinePaint(0, Color.GREEN);
        renderer.setSeriesOutlineStroke(1, new BasicStroke(1.0f));
        
        // Verify additional settings
        System.out.println("Series 0 outline paint: " + renderer.getSeriesOutlinePaint(0));
        System.out.println("Series 1 outline stroke: " + renderer.getSeriesOutlineStroke(1));
    }
}